package Semantic;

public class DivisionByZeroError implements SemanticError {
    private final String _name;
    private final int _line;
    private final int _column;
    private final String _message;

    public DivisionByZeroError(String name, int line, int column) {
        _name = name;
        _line = line;
        _column = column;
        _message = String.format("Missing Required Component Property: '%s' at line %d and column %d", name, line, column);
    }

    @Override
    public String getType() {
        return "DivisionByZeroError";
    }

    @Override
    public String getMessage() {
        return String.format("Division By Zero of '%s' at line %d and column %d", _name, _line, _column);
    }

    public String getName() {
        return _name;
    }

    public int getLine() {
        return _line;
    }

    public int getColumn() {
        return _column;
    }

    @Override
    public String toString() {
        return String.format("[%s] at line %d, column %d: %s",
                getType(), _line, _column, getMessage());
    }
}
