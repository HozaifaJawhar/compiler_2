package AST.Expression;

public class LiteralExpression implements Expression
{
    private final String _value;
    public LiteralExpression(String value)
    {
        _value = value;
    }
    public String getValue()
    {
        return _value;
    }
    @Override
    public String toString()
    {
        return _value;
    }
}
