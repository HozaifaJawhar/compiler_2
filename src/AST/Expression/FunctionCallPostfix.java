package AST.Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionCallPostfix implements PostfixPart {
    private final List<Expression> arguments;

    public FunctionCallPostfix(List<Expression> arguments) {
        this.arguments = arguments == null ? new ArrayList<>() : arguments;
    }

    public List<Expression> getArguments() { return arguments; }

    @Override
    public String toString() {
        String args = arguments.stream().map(Object::toString).collect(Collectors.joining(", "));
        return "(" + args + ")";
    }
}
