package AST.Types;

import AST.Expression.Expression;
import AST.Expression.PostfixPart;

import java.util.List;
import java.util.stream.Collectors;


public class FunctionCall implements PostfixPart
{
    private final List<Expression> _arguments;
    public FunctionCall(List<Expression> arguments)
    {
        _arguments = arguments;
    }
    public List<Expression> getArguments()
    {
        return _arguments;
    }
    @Override
    public String toString()
    {
        String args = _arguments.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        return "(" + args + ")";
    }
}
