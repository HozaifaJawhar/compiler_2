package Semantic;

import java.util.List;

public class CircularDependencyError implements SemanticError {

    public CircularDependencyError() {
    }

    @Override
    public String getType() {
        return "CircularDependencyError";
    }

    @Override
    public String getMessage() {
        return String.format(" CircularDependency detected.");
    }

    @Override
    public int getLine() { return 0; }

    @Override
    public int getColumn() { return 0; }

    @Override
    public String toString() {
        return String.format("[%s]" , getType()) + getMessage();
    }
}
