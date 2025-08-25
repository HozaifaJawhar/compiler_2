package AST.Expression;

public class LiteralExpression implements Expression {
    private final String value;

    public LiteralExpression(String tokenText) {
        this.value = unquoteAndUnescape(tokenText);
    }

    public String getValue() { return value; }

    @Override
    public String toString() { return "'" + value + "'"; }

    private static String unquoteAndUnescape(String s) {
        if (s == null || s.length() < 2 || s.charAt(0) != '\'' || s.charAt(s.length()-1) != '\'') {
            return s;
        }
        String inner = s.substring(1, s.length() - 1);
        StringBuilder out = new StringBuilder(inner.length());
        boolean esc = false;
        for (int i = 0; i < inner.length(); i++) {
            char c = inner.charAt(i);
            if (esc) {
                switch (c) {
                    case 'n' -> out.append('\n');
                    case 't' -> out.append('\t');
                    case 'r' -> out.append('\r');
                    case '\'' -> out.append('\'');
                    case '\\' -> out.append('\\');
                    default -> out.append(c);
                }
                esc = false;
            } else if (c == '\\') {
                esc = true;
            } else {
                out.append(c);
            }
        }
        return out.toString();
    }
}
