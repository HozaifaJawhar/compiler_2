package AST.Expression;

import AST.Expression.Expression;

public class AssignmentExpression implements Expression
{
    private final Expression _target;
    private final Expression _value;
    public AssignmentExpression(Expression target, Expression value)
    {
        _target = target;
        _value = value;
    }
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("AssignmentExpression( Target = " + _target + ", Value = " + _value + " )");
        return builder.toString();
    }
}
