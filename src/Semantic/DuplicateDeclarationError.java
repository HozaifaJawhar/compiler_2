package Semantic;

public class DuplicateDeclarationError implements SemanticError {
    private final String _name;
    private final int _line;
    private final int _column;

    public DuplicateDeclarationError(String name, int line, int column) {
        this._name = name;
        this._line = line;
        this._column = column;
    }

    @Override
    public String getType() {
        return "DuplicateDeclarationError";
    }

    @Override
    public String getMessage() {
        return String.format("Duplicate declaration of '%s' at line %d and column %d", _name, _line, _column);
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
