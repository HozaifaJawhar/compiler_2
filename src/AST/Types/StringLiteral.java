package AST.Types;

import AST.Expression.Expression;

public class StringLiteral implements Expression
{
    private final String _value;
    public StringLiteral(String value)
    {
        _value = value;
    }
    public String getValue()
    {
        return _value;
    }
    public String toString()
    {
        return "\"" + _value + "\"";
    }
}