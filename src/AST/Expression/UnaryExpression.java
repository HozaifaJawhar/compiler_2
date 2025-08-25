package AST.Expression;

import AST.Expression.Expression;

public class UnaryExpression implements Expression
{
    private final String _operator;
    private final Expression _expression;
    public UnaryExpression(String operator, Expression expression)
    {
        _operator = operator;
        _expression = expression;
    }
    public String getOperator()
    {
        return _operator;
    }
    public Expression getExpression()
    {
        return _expression;
    }
    @Override
    public String toString()
    {
        return _operator + _expression.toString();
    }}
