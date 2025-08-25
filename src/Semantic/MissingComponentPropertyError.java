package Semantic;

public class MissingComponentPropertyError implements SemanticError
{
    private final String _property;
    private final int _line;
    private final int _column;

    public MissingComponentPropertyError(String property, int line, int column) {
        _property = property;
        _line = line;
        _column = column;
    }

    @Override
    public String getType() {
        return "MissingComponentPropertyError";
    }

    @Override
    public String getMessage() {
        return "Missing Required Component Property: '" + _property + "'" + " at line " + _line + " and column " + _column;
    }

    @Override
    public int getLine() {
        return _line;
    }

    @Override
    public int getColumn() {
        return _column;
    }

    public String getProperty() {
        return _property;
    }

    @Override
    public String toString() {
        return String.format(
                "[%s] at line %d, column %d: %s",
                getType(), getLine(), getColumn(), getMessage()
        );
    }
}
