package AST.Expression;

import AST.Expression.Expression;

import java.util.List;
import java.util.stream.Collectors;

public class NewExpression implements Expression
{
    private final String _className;
    private final List<Expression> _arguments;
    public NewExpression(String className, List<Expression> arguments)
    {
        _className = className;
        _arguments = arguments;
    }
    @Override
    public String toString()
    {
        String args = _arguments.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        return "new " + _className + "(" + args + ")";
    }
}
