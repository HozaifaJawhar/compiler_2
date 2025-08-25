package AST.Expression;

import AST.Expression.Expression;

public class ConditionalExpression implements Expression
{
    private final Expression _condition;
    private final Expression _trueExpr;
    private final Expression _falseExpr;
    public ConditionalExpression(Expression condition, Expression trueExpr, Expression falseExpr)
    {
        _condition = condition;
        _trueExpr = trueExpr;
        _falseExpr = falseExpr;
    }
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("ConditionalExpression( Condition = " + _condition + ", ? = " + _trueExpr + ", : = " + _falseExpr + " )");
        return builder.toString();
    }
}
