package Semantic;

public class UndeclaredVariableError implements SemanticError {

    private final String _variableName;
    private final int _line;
    private final int _column;
    public UndeclaredVariableError(String variableName, int line, int column) {

        _variableName = variableName;
        _line = line;
        _column = column;
    }

    @Override
    public String getType() {
        return "UndeclaredVariableError";
    }

    @Override
    public String getMessage() {
        return "Variable " + _variableName + " is not declared.";
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
        return String.format("[%s] Line %d, Column %d: %s", getType(), _line, _column, getMessage());
    }
}
