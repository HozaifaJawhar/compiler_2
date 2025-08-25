package AST.Statement;

import AST.Expression.Expression;

public class ReturnStatement implements Statement
{
    private final Expression _expression; // can be null
    public ReturnStatement(Expression expression)
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
        return "return" + (_expression != null ? " " + _expression : "");
    }
}
