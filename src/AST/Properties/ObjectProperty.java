package AST.Properties;

import AST.ASTNode;
import AST.Expression.Expression;

public class ObjectProperty implements ASTNode
{
    private final String _key;
    private final Expression _value;
    public ObjectProperty(String key, Expression value)
    {
        this._key = key;
        this._value = value;
    }
    public String getKey()
    {
        return _key;
    }
    public Expression getValue()
    {
        return _value;
    }
    @Override
    public String toString()
    {
        return _key + ": " + _value;
    }
}
