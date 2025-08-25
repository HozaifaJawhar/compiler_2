package AST.Expression;

public class OptionalPropertyAccess implements PostfixPart {
    private final String property;

    public OptionalPropertyAccess(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

    @Override
    public String toString() {
        return "?." + property;
    }
}
