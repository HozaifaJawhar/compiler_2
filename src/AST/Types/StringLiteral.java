package AST.Types;

import AST.ASTNode;

public class StringLiteral implements ASTNode {

    private final String value;

    public StringLiteral(String tokenText) {
        this.value = unquote(tokenText);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "'" + value + "'";
    }

    private static String unquote(String s) {
        if (s == null || s.length() < 2) return s;
        char first = s.charAt(0), last = s.charAt(s.length() - 1);
        if ((first == '\'' && last == '\'') || (first == '"' && last == '"')) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }
}