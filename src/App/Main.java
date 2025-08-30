package App;

// ANTLR and AST Imports
import AST.ASTNode;
import AST.Program;
import Visitor.AngularCompVisitor;
import antlr.AngularLexer;
import antlr.AngularParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

// Semantic Analysis Imports
import Semantic.SemanticError;

// Code Generation Imports
import generator.AngularCodeGenerator;
import generator.AngularCodeGenerator.GenOptions;

// Java Standard Library Imports
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        try {
            // ✅ تحديد الملف المدخل مباشرة في الكود كما طلبت
            String inputFile = "test/test_main.txt";

            // 1. إعداد الـ Lexer و Parser
            CharStream input = CharStreams.fromFileName(inputFile);
            AngularLexer lexer = new AngularLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(tokens);

            // 2. تحليل الكود وإنشاء شجرة التحليل (Parse Tree)
            ParseTree tree = parser.program();

            // 3. زيارة الشجرة باستخدام Visitor لبناء شجرة AST
            AngularCompVisitor visitor = new AngularCompVisitor();
            ASTNode ast = (ASTNode) visitor.visit(tree);

            // --- بداية طباعة الخرج المنظم ---

            // 4. طباعة شجرة AST مع عنوان واضح
            System.out.println("============== Abstract Syntax Tree (AST) ==============");
            System.out.println(ast);
            System.out.println("========================================================");
            System.out.println();

            // 5. طباعة جدول الرموز
            System.out.println("==============  Symbol Table ==============");
            System.out.println(visitor.s.toString());
            System.out.println("==========================================");
            System.out.println();

            // 6. طباعة الأخطاء الدلالية (إن وجدت)
            System.out.println("============== Semantic Analysis ==============");
            if (!visitor.errorReporter.getErrors().isEmpty()) {
                System.out.println("Found " + visitor.errorReporter.getErrors().size() + " Semantic Errors:");
                for (SemanticError error : visitor.errorReporter.getErrors()) {
                    System.out.println("- " + error);
                }
            } else {
                System.out.println("No Semantic Errors detected.");
            }
            System.out.println("=============================================");
            System.out.println();

            // 7. طباعة حالة توليد الكود
            System.out.println("============== Code Generation ==============");
            GenOptions options = new GenOptions();
            options.mode = AngularCodeGenerator.Mode.INLINE;
            options.baseFileName = "CodeGenerated";

            AngularCodeGenerator codeGenerator = new AngularCodeGenerator(options);
            Map<String, String> files = codeGenerator.generate((Program) ast);

            Path outDir = Paths.get("out_ts");
            Files.createDirectories(outDir);

            for (Map.Entry<String, String> entry : files.entrySet()) {
                Path filePath = outDir.resolve(entry.getKey());
                Files.writeString(filePath, entry.getValue());
                System.out.println("Generated: " + filePath);
            }
            System.out.println("\nCode generation completed successfully!");
            System.out.println("=========================================");

        } catch (IOException e) {
            System.err.println("Failed to read input file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}