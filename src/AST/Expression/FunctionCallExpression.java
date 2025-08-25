package AST.Expression;

import AST.Expression.Expression;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionCallExpression implements Expression
{
    private final List<Expression> _arguments;
    public FunctionCallExpression(List<Expression> arguments)
    {
        _arguments = arguments;
    }
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("FunctionCall( ) ");
        return builder.toString();
    }
}
