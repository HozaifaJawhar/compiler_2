package AST.Statement;

import AST.Expression.Expression;

public class WhileStatement implements Statement
{
    private final Expression _condition;
    private final Statement _body;
    public WhileStatement(Expression condition, Statement body)
    {
        _condition = condition;
        _body = body;
    }
    public Expression getCondition() {
        return _condition;
    }
    public Statement getBody() {
        return _body;
    }
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("WhileStatement \n{\n")
               .append("Condition = " + _condition + "\n")
               .append("Body = " + _body.toString() + "\n");
        return builder.toString();
    }

}
