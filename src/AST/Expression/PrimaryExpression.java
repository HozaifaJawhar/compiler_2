package AST.Expression;

import AST.ASTNode;
import AST.Expression.Expression;

public class PrimaryExpression implements Expression
{
    private final ASTNode _value;
    public PrimaryExpression(ASTNode value)
    {
        _value = value;
    }
    public ASTNode getValue()
    {
        return _value;
    }
    @Override
    public String toString()
    {
        return _value.toString();
    }
}
