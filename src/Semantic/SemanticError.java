package Semantic;

public interface SemanticError {
    String getType();
    String getMessage();
    int getLine();
    int getColumn();

    @Override
    String toString();
}
