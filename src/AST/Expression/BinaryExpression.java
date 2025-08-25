package AST.Expression;

import AST.Expression.Expression;

public class BinaryExpression implements Expression
{
    private final Expression _left;
    private final String _operator;
    private final Expression _right;
    public BinaryExpression(Expression left, String operator, Expression right)
    {
        _left = left;
        _operator = operator;
        _right = right;
    }
    public Expression getLeft()
    {
        return _left;
    }
    public String getOperator()
    {
        return _operator;
    }
    public Expression getRight()
    {
        return _right;
    }
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BinaryExpression( Left = " + _left + ", Operator = " + _operator + ", Right = " + _right + " )");
        return builder.toString();
    }
}
