package Semantic;

import java.util.ArrayList;
import java.util.List;

public class SemanticErrorReporter {
    private final List<SemanticError> errors = new ArrayList<>();

    public SemanticErrorReporter() {

    }

    public void report(SemanticError error) {
        errors.add(error);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public List<SemanticError> getErrors() {
        return errors;
    }

    public void printErrors() {
        for (SemanticError error : errors) {
            System.err.println(error);
        }
    }
}

