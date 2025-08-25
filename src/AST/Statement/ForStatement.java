package AST.Statement;

import AST.Expression.Expression;

public class ForStatement implements Statement
{
    private final Statement _initializer;
    private final Expression _condition;
    private final Expression _update;
    private final Statement _body;
    public ForStatement(Statement initializer, Expression condition, Expression update, Statement body)
    {
        _initializer = initializer;
        _condition = condition;
        _update = update;
        _body = body;
    }
    public Statement getInitializer()
    {
        return _initializer;
    }
    public Expression getCondition()
    {
        return _condition;
    }
    public Expression getUpdate()
    {
        return _update;
    }
    public Statement getBody()
    {
        return _body;
    }
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("for (");
        sb.append(_initializer != null ? _initializer.toString() : "").append("; ");
        sb.append(_condition != null ? _condition.toString() : "").append("; ");
        sb.append(_update != null ? _update.toString() : "");
        sb.append(") ");
        sb.append(_body != null ? _body.toString() : "{}");
        return sb.toString();
    }
}
