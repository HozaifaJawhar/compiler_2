package AST.Expression;

public class PostfixUnknown implements PostfixPart {
    private final String raw;
    public PostfixUnknown(String raw) { this.raw = raw; }
    @Override
    public String toString() { return "/*postfix:" + raw + "*/"; }
}
