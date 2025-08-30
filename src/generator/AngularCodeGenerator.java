package generator;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

import AST.Program;
import AST.ASTNode;
import AST.Statement.*;
import AST.Declarations.*;
import AST.Properties.*;
import AST.Types.*;
import AST.Expression.*;

public class AngularCodeGenerator {

    public enum Mode { INLINE, SPLIT }

    public static class GenOptions {
        public Mode mode = Mode.INLINE;                // inline template/styles
        public String baseFileName = "CodeGenerated";  // ناتج: out_ts/CodeGenerated.ts
    }

    private final GenOptions options;
    private final CodeWriter w = new CodeWriter();

    public AngularCodeGenerator(GenOptions options) {
        this.options = (options == null) ? new GenOptions() : options;
    }

    public Map<String,String> generate(Program program) {
        Map<String,String> out = new LinkedHashMap<>();
        wProgram(program);
        out.put(options.baseFileName + ".ts", w.toString());
        return out;
    }

    // ================= Program =================
    private void wProgram(Program p) {
        List<ImportStatement> imports = safeList(call0(p, "getImportStatements"), ImportStatement.class);
        List<ComponentDefinition> components = safeList(call0(p, "getComponents"), ComponentDefinition.class);

        if (imports != null) {
            for (ImportStatement imp : imports) wImport(imp);
            if (!imports.isEmpty()) w.newline();
        }

        if (components != null) {
            for (ComponentDefinition cd : components) {
                wComponent(cd);
                w.newline();
            }
        }
    }

    // ================= Imports =================
    private void wImport(ImportStatement imp) {
        List<ImportItem> items = firstListOfType(imp, ImportItem.class,
                "getItems","getImportItems","getImports","items","importItems");
        if (items == null) items = Collections.emptyList();

        String modulePath = firstString(imp,
                "getModulePath","getPath","getModule","getFrom","modulePath","path","module");
        if (modulePath == null) modulePath = "";

        w.write("import { ");
        for (int i = 0; i < items.size(); i++) {
            if (i > 0) w.write(", ");
            w.write(items.get(i).getIdentifier());
        }
        w.write(" } from '").write(modulePath).writeln("';");
    }

    // ================= Component =================
    private void wComponent(ComponentDefinition cd) {
        ComponentConfig config = (ComponentConfig) firstNonNull(
                call0(cd, "getConfig"), call0(cd, "getComponentConfig"),
                field0(cd, "config"), field0(cd, "componentConfig"));

        ClassDeclaration clazz = (ClassDeclaration) firstNonNull(
                call0(cd, "getClassDeclaration"), call0(cd, "getClassDecl"),
                call0(cd, "getClazz"), call0(cd, "getClass_"),
                field0(cd, "classDeclaration"), field0(cd, "clazz"), field0(cd, "cls"));

        w.writeln("@Component({");
        wComponentConfig(config);
        w.writeln("})");
        wClass(clazz, true);
    }

    private void wComponentConfig(ComponentConfig cfg) {
        if (cfg == null) return;

        List<ComponentProperty> props = firstListOfType(cfg, ComponentProperty.class,
                "getProperties","getProps","properties","props");
        if (props == null) props = scanAllListsOfType(cfg, ComponentProperty.class);
        if (props == null) props = Collections.emptyList();

        SelectorProperty sel = null;
        StandaloneProperty std = null;
        ImportsProperty imps = null;
        TemplateProperty tpl = null;
        StylesProperty stl = null;

        for (ComponentProperty p : props) {
            if (p instanceof SelectorProperty) sel = (SelectorProperty)p;
            else if (p instanceof StandaloneProperty) std = (StandaloneProperty)p;
            else if (p instanceof ImportsProperty) imps = (ImportsProperty)p;
            else if (p instanceof TemplateProperty) tpl = (TemplateProperty)p;
            else if (p instanceof StylesProperty) stl = (StylesProperty)p;
        }

        if (sel != null) w.writeln("  selector: '" + escapeStr(sel.getValue()) + "',");
        if (std != null) w.writeln("  standalone: " + std.getValue() + ",");

        if (imps != null) {
            w.write("  imports: [");
            List<ASTNode> list = imps.getImports();
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) w.write(", ");
                w.write(String.valueOf(list.get(i)));
            }
            w.writeln("],");
        }

        if (options.mode == Mode.SPLIT) {
            if (tpl != null) w.writeln("  templateUrl: './component.html',");
            if (stl != null) w.writeln("  styleUrls: ['./component.css'],");
        } else {
            if (tpl != null) {
                w.writeln("  template: `");
                w.writeln(indentMultiline(tpl.getTemplate()));
                w.writeln("  `,");
            }
            if (stl != null) {
                w.writeln("  styles: [");
                for (String s : stl.getStyles()) {
                    w.writeln("    `");
                    w.writeln(indentMultiline(s));
                    w.writeln("    `,");
                }
                w.writeln("  ],");
            }
        }
    }

    // ================= Class =================
    private void wClass(ClassDeclaration c, boolean exported) {
        if (c == null) return;

        String className = c.getClassName();
        w.write(exported ? "export class " : "class ");
        w.write(className).writeln(" {");

        ClassBody body = (ClassBody) firstNonNull(
                call0(c, "getClassBody"), call0(c, "getBody"),
                field0(c, "classBody"), field0(c, "body"));

        List<ClassMember> members = null;
        if (body != null) {
            members = firstListOfType(body, ClassMember.class,
                    "getMembers","getMemberList","getElements","members");
            if (members == null) members = scanAllListsOfType(body, ClassMember.class);
        }
        if (members == null) {
            members = firstListOfType(c, ClassMember.class, "members","getMembers","elements","getElements");
            if (members == null) members = scanAllListsOfType(c, ClassMember.class);
        }

        if (members != null) for (ClassMember m : members) {
            if (m instanceof FieldDeclaration) wField((FieldDeclaration)m);
            else if (m instanceof MethodDeclaration) wMethod((MethodDeclaration)m);
        }

        w.writeln("}");
    }

    private void wField(FieldDeclaration f) {
        String name = f.getName();
        String typeStr = tsType(f.getType());
        String init = (f.getInitializer() != null) ? emitExpr(f.getInitializer()) : null;

        // تحسينات صغيرة: لو init == [] والنوع لا ينتهي بـ []، خليه مصفوفة
        if ("[]".equals(init) && typeStr != null && !typeStr.isEmpty() && !typeStr.endsWith("[]")) {
            typeStr = typeStr + "[]";
        }
        // لو init null والنوع ليس فيه | null، ضفها (اختياري)
        if ("null".equals(init) && typeStr != null && !typeStr.isEmpty() && !typeStr.contains("| null")) {
            typeStr = typeStr + " | null";
        }

        String line = "  " + name
                + (typeStr == null || typeStr.isEmpty() ? "" : (": " + typeStr))
                + (init != null ? (" = " + init) : "")
                + ";";
        w.writeln(line);
    }

    private void wMethod(MethodDeclaration m) {
        String name = m.getMethodName();

        List<Parameter> params = m.getParameters();
        String ps = params.stream()
                .map(p -> {
                    String t = tsType(p.getType());
                    return p.getName() + (t.isEmpty() ? "" : (": " + t));
                })
                .collect(Collectors.joining(", "));

        String rt = tsType(m.getReturnType());
        String retPart = rt.isEmpty() ? "" : (": " + rt);

        w.writeln("  " + name + "(" + ps + ")" + retPart + " {");
        wBlock(m.getBlock());
        w.writeln("  }");
    }

    private void wBlock(BlockStatement b) {
        if (b == null) return;
        for (Statement s : b.getStatements()) {
            wStmt(s);
        }
    }

    // ================= Statements =================
    private void wStmt(Statement s) {
        if (s instanceof VariableDeclarationStatement v) {
            String varName = firstString(v,"getVarName","getName","getIdentifier","varName","name","identifier");
            TypeAnnotation tAnn = (TypeAnnotation) firstNonNull(
                    call0(v, "getTypeAnnotation"), call0(v, "getType"),
                    field0(v, "typeAnnotation"), field0(v, "type"));
            Expression initExpr = (Expression) firstNonNull(
                    call0(v, "getInitializer"), call0(v, "getInit"), call0(v, "getExpression"),
                    field0(v, "initializer"), field0(v, "expression"));

            String t = tsType(tAnn);
            String init = (initExpr != null) ? emitExpr(initExpr) : null;

            if ("[]".equals(init) && t != null && !t.isEmpty() && !t.endsWith("[]")) t = t + "[]";
            if ("null".equals(init) && t != null && !t.isEmpty() && !t.contains("| null")) t = t + " | null";

            String line = "    let " + (varName == null ? "_" : varName)
                    + (t.isEmpty() ? "" : (": " + t))
                    + (init != null ? (" = " + init) : "")
                    + ";";
            w.writeln(line);

        } else if (s instanceof ExpressionStatement es) {
            w.writeln("    " + emitExpr(es.getExpression()) + ";");

        } else if (s instanceof ReturnStatement rs) {
            w.writeln("    return " + (rs.getExpression() != null ? emitExpr(rs.getExpression()) : "") + ";");

        } else if (s instanceof IfStatement is) {
            w.writeln("    if (" + emitExpr(is.getCondition()) + ") {");
            if (is.getThenBranch() != null) wBlock(is.getThenBranch());
            w.writeln("    }" + (is.getElseBranch() != null ? " else {" : ""));
            if (is.getElseBranch() != null) {
                wBlock(is.getElseBranch());
                w.writeln("    }");
            }

        } else if (s instanceof BreakStatement) {
            w.writeln("    break;");

        } else {
            w.writeln("    /* TODO stmt: " + s.getClass().getSimpleName() + " */");
        }
    }

    // ================= Expressions =================
    private String emitExpr(Expression e) {
        if (e == null) return "";

        if (e instanceof ThisExpression) {
            return "this";
        }
        if (e instanceof IdentifierExpression id) {
            return id.getName();
        }
        if (e instanceof BooleanLiteral bl) {
            return String.valueOf(bl.getValue());
        }
        if (e instanceof LiteralExpression lit) {
            Object v = lit.getValue();
            if (v == null) return "null";
            String s = String.valueOf(v);
            if ("<array>".equals(s)) return "[]";
            if (looksLikeNumber(s) || "null".equals(s) || "true".equals(s) || "false".equals(s)) {
                return s;
            }
            return quoteString(s);
        }
        if (e instanceof BinaryExpression be) {
            return emitExpr(be.getLeft()) + " " + be.getOperator() + " " + emitExpr(be.getRight());
        }
        if (e instanceof ConditionalExpression ce) {
            Expression cond = (Expression) firstNonNull(
                    call0(ce, "getCondition"), call0(ce, "getCond"),
                    field0(ce, "condition"), field0(ce, "cond"));
            Expression t = (Expression) firstNonNull(
                    call0(ce, "getTrueExpr"), call0(ce, "getThen"), call0(ce, "getTrueExpression"),
                    field0(ce, "trueExpr"), field0(ce, "thenExpr"));
            Expression f = (Expression) firstNonNull(
                    call0(ce, "getFalseExpr"), call0(ce, "getElse"), call0(ce, "getFalseExpression"),
                    field0(ce, "falseExpr"), field0(ce, "elseExpr"));
            return emitExpr(cond) + " ? " + emitExpr(t) + " : " + emitExpr(f);
        }
        if (e instanceof NewExpression ne) {
            String className = firstString(ne,"getClassName","getTypeName","getIdentifier","className","typeName","identifier");
            List<Expression> args = safeList(
                    firstNonNull(call0(ne,"getArgs"),call0(ne,"getArguments"),call0(ne,"getParams"),
                            call0(ne,"getParameters"),field0(ne,"args"),field0(ne,"arguments"),
                            field0(ne,"params"),field0(ne,"parameters")),
                    Expression.class);
            if (args == null) args = Collections.emptyList();

            StringBuilder sb = new StringBuilder("new ").append(className == null ? "" : className).append("(");
            for (int i = 0; i < args.size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(emitExpr(args.get(i)));
            }
            return sb.append(")").toString();
        }
        if (e instanceof ArrowFunctionExpression af) {
            String ps = String.join(", ", af.getParams());
            return "(" + ps + ") => " + emitExpr(af.getBody());
        }
        if (e instanceof PostfixExpression pe) {
            StringBuilder sb = new StringBuilder();
            sb.append(emitExpr(pe.getBase()));
            for (PostfixPart p : pe.getParts()) {
                // Property access
                String prop = firstString(p,"getPropertyName","getName","getProperty","propertyName","name","property");
                if (prop != null) {
                    sb.append(".").append(prop);
                    continue;
                }
                // Function call (انعكاس عام)
                List<Expression> args = safeList(
                        firstNonNull(call0(p,"getArgs"),call0(p,"getArguments"),call0(p,"getParams"),
                                call0(p,"getParameters"),field0(p,"args"),field0(p,"arguments"),
                                field0(p,"params"),field0(p,"parameters")),
                        Expression.class);
                if (args != null) {
                    sb.append("(");
                    for (int i = 0; i < args.size(); i++) {
                        if (i > 0) sb.append(", ");
                        sb.append(emitExpr(args.get(i)));
                    }
                    sb.append(")");
                    continue;
                }
                // Postfix ++ (اسم صنفك قد يختلف)
                if (p instanceof AST.Expression.PostfixIncrement) {
                    sb.append("++");
                    continue;
                }

                // fallback
                sb.append("/*postfix:" + p.getClass().getSimpleName() + "*/");
            }
            return sb.toString();
        }
        if (e instanceof ObjectExpression oe) {
            StringBuilder sb = new StringBuilder("{ ");
            boolean first = true;
            for (ObjectExpression.Element el : oe.getElements()) {
                if (el instanceof ObjectExpression.PropertyElement pel) {
                    ObjectProperty prop = pel.getProperty();
                    String key = firstString(prop,"getKey","getName","key","name");
                    Expression val = (Expression) firstNonNull(
                            call0(prop, "getValue"), call0(prop, "getExpr"),
                            field0(prop, "value"), field0(prop, "expr"));
                    if (!first) sb.append(", ");
                    first = false;
                    sb.append(key == null ? "" : key).append(": ").append(emitExpr(val));
                }
            }
            sb.append(" }");
            return sb.toString();
        }

        return "/*expr " + e.getClass().getSimpleName() + "*/";
    }

    // ================= Helpers =================
    private String tsType(TypeAnnotation t) {
        if (t == null) return "";
        String s = String.valueOf(t);
        return (s == null) ? "" : s;
    }

    private static String quoteString(String s) {
        return "'" + s.replace("\\", "\\\\").replace("'", "\\'") + "'";
    }

    private static String escapeStr(String s) {
        return s.replace("\\", "\\\\").replace("'", "\\'");
    }

    private static boolean looksLikeNumber(String s) {
        if (s == null) return false;
        return s.matches("-?\\d+(\\.\\d+)?");
    }

    private static String indentMultiline(String s) {
        if (s == null || s.isEmpty()) return "";
        String[] lines = s.split("\\R", -1);
        StringBuilder out = new StringBuilder();
        for (String ln : lines) out.append("    ").append(ln).append("\n");
        return out.toString();
    }

    // ===== Reflection compatibility =====
    private static Object firstNonNull(Object... cs) { for (Object c: cs) if (c!=null) return c; return null; }

    private static Object call0(Object obj, String methodName) {
        if (obj == null || methodName == null) return null;
        try {
            Method m = obj.getClass().getMethod(methodName);
            m.setAccessible(true);
            return m.invoke(obj);
        } catch (Throwable ignored) { return null; }
    }

    private static Object field0(Object obj, String fieldName) {
        if (obj == null || fieldName == null) return null;
        try {
            Field f = obj.getClass().getDeclaredField(fieldName);
            f.setAccessible(true);
            return f.get(obj);
        } catch (Throwable ignored) { return null; }
    }

    @SuppressWarnings("unchecked")
    private static <T> List<T> safeList(Object obj, Class<T> elem) {
        if (obj == null) return null;
        if (obj instanceof List<?> l) {
            List<T> out = new ArrayList<>();
            for (Object o : l) if (elem.isInstance(o)) out.add((T)o);
            return out;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private static <T> List<T> firstListOfType(Object obj, Class<T> elemType, String... names) {
        if (obj == null) return null;
        for (String n : names) {
            Object viaMethod = call0(obj, n);
            List<T> l = safeList(viaMethod, elemType);
            if (l != null) return l;

            Object viaField = field0(obj, n);
            l = safeList(viaField, elemType);
            if (l != null) return l;
        }
        return scanAllListsOfType(obj, elemType);
    }

    @SuppressWarnings("unchecked")
    private static <T> List<T> scanAllListsOfType(Object obj, Class<T> elemType) {
        if (obj == null) return null;
        try {
            for (Field f : obj.getClass().getDeclaredFields()) {
                f.setAccessible(true);
                Object v = f.get(obj);
                List<T> l = safeList(v, elemType);
                if (l != null && !l.isEmpty()) return l;
            }
        } catch (Throwable ignored) {}
        return null;
    }

    private static String firstString(Object obj, String... names) {
        Object v = firstOfAny(obj, names);
        return (v == null) ? null : String.valueOf(v);
    }

    private static Object firstOfAny(Object obj, String... names) {
        for (String n : names) {
            Object viaMethod = call0(obj, n);
            if (viaMethod != null) return viaMethod;
            Object viaField = field0(obj, n);
            if (viaField != null) return viaField;
        }
        return null;
    }
}
