package AST.Expression;

import java.util.List;

public class PostfixExpression implements Expression {
    private final Expression _base;
    private final List<Object> _parts;
    public PostfixExpression(Expression base, List<Object> parts)
    {
        _base = base;
        _parts = parts;
    }
    public Expression getBase()
    {
        return _base;
    }
    public List<Object> getParts()
    {
        return _parts;
    }
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder(_base.toString());
        for (Object part : _parts) {
            sb.append(part.toString());
        }
        return sb.toString();
    }
}