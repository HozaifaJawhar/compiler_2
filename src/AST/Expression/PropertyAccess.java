package AST.Expression;

public class PropertyAccess implements PostfixPart {
    private final String property;

    public PropertyAccess(String property) { this.property = property; }

    public String getProperty() { return property; }

    @Override
    public String toString() { return "." + property; }
}
