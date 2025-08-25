package AST.Statement;

import AST.Expression.Expression;

public class ExpressionStatement implements Statement
{
    private final Expression _expression;
    public ExpressionStatement(Expression expression)
    {
        _expression = expression;
    }
    public Expression getExpression()
    {
        return _expression;
    }
    @Override
    public String toString()
    {
        if (_expression == null) {
            return "";
        }
        return _expression.toString();
    }
}

