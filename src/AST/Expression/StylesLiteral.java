package AST.Expression;

public class StylesLiteral implements Expression {
    private final String raw;

    public StylesLiteral(String tokenText) {
        this.raw = stripBackticks(tokenText);
    }

    public String getRaw() {
        return raw;
    }

    @Override
    public String toString() {
        return "`" + raw + "`";
    }

    private static String stripBackticks(String s) {
        if (s == null || s.length() < 2) return s;
        if (s.charAt(0) == '`' && s.charAt(s.length() - 1) == '`') {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }
}
