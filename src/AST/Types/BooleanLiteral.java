package AST.Types;

import AST.Expression.Expression;

public class BooleanLiteral implements Expression
{
    private final boolean _value;
    public BooleanLiteral(boolean value)
    {
        _value = value;
    }
    public boolean getValue()
    {
        return _value;
    }
    @Override
    public String toString()
    {
        return Boolean.toString(_value);
    }
}
