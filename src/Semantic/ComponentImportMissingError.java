package Semantic;

public class ComponentImportMissingError implements SemanticError
{
    private final String _name;
    private final int _line;
    private final int _column;
    private final String _message;
    public ComponentImportMissingError(String name, int line, int column) {
        _name = name;
        _line = line;
        _column = column;
        _message = String.format("Missing Component Import Statement : '%s' at line %d and column %d", _name, _line, _column);
    }

    @Override
    public String getType() {
        return "ComponentImportMissingError";
    }

    @Override
    public String getMessage() {
        return _message;
    }

    @Override
    public int getLine() {
        return _line;
    }

    @Override
    public int getColumn() {
        return _column;
    }

    @Override
    public String toString() {
        return String.format("[%s] at line %d, column %d: %s",
                getType(), _line, _column, getMessage());
    }
}
