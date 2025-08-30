package AST.Types;

import AST.ASTNode;
import java.util.*;

public class TypeAnnotation {
    // إما union terms (مثل: "'list'", "'add'", "'details'") أو عقدة AST (IdentifierType/InlineObjectType/..)
    private final List<String> unionTerms; // null إذا لا يوجد اتحاد
    private final ASTNode typeNode;        // null إذا عندنا اتحاد نصوص
    private final boolean isArray;

    /** منشئ لنوع مبني على عقدة AST (IdentifierType, InlineObjectType, …) */
    public TypeAnnotation(ASTNode type) {
        this(type, false);
    }

    public TypeAnnotation(ASTNode type, boolean isArray) {
        this.typeNode = type;
        this.unionTerms = null;
        this.isArray = isArray;
    }

    /** منشئ لاتحاد نصوص (يجب أن تكون النصوص بصيغة TypeScript جاهزة: قد تتضمن علامات اقتباس) */
    public TypeAnnotation(List<String> terms, boolean isArray) {
        this.unionTerms = (terms == null || terms.isEmpty()) ? null : new ArrayList<>(terms);
        this.typeNode = null;
        this.isArray = isArray;
    }

    /** مصنع: اتحاد */
    public static TypeAnnotation union(List<String> terms, boolean isArray) {
        return new TypeAnnotation(terms, isArray);
    }

    /** مصنع: نوع مفرد كنص */
    public static TypeAnnotation single(String term, boolean isArray) {
        return new TypeAnnotation(Collections.singletonList(term), isArray);
    }

    /** متوافق مع الكود القديم لديك */
    public ASTNode getType() {
        return typeNode;
    }

    /** هل النوع عبارة عن اتحاد نصوص؟ */
    public boolean hasUnion() {
        return unionTerms != null;
    }

    public List<String> getTerms() {
        return unionTerms == null ? Collections.emptyList() : Collections.unmodifiableList(unionTerms);
    }

    public boolean isArray() {
        return isArray;
    }

    @Override
    public String toString() {
        String core;
        if (unionTerms != null) {
            core = String.join(" | ", unionTerms);
        } else {
            core = (typeNode == null) ? "" : typeNode.toString();
        }
        if (core == null || core.isEmpty()) return "";
        return isArray ? core + "[]" : core;
    }
}
