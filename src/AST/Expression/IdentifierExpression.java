package AST.Expression;

public class IdentifierExpression implements Expression
{
    private final String _name;
    public IdentifierExpression(String name)
    {
        _name = name;
    }
    public String getName()
    {
        return _name;
    }
    public String toString()
    {
        return _name;
    }
}
