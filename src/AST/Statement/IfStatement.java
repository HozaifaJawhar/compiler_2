package AST.Statement;

import AST.Expression.Expression;

public class IfStatement implements Statement
{
    private final Expression _condition;
    private final BlockStatement _thenBranch;
    private final BlockStatement _elseBranch;
    public IfStatement(Expression condition, BlockStatement thenBranch, BlockStatement elseBranch)
    {
        _condition = condition;
        _thenBranch = thenBranch;
        _elseBranch = elseBranch;
    }
    public Expression getCondition()
    {
        return _condition;
    }
    public BlockStatement getThenBranch()
    {
        return _thenBranch;
    }
    public BlockStatement getElseBranch()
    {
        return _elseBranch;
    }
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("IfStatement \n{\n")
                .append("Condition = " + _condition + "\n")
                .append("Body = " + _thenBranch.toString() + "\n");
        return builder.toString();
    }
}
