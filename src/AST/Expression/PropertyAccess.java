package AST.Expression;

import AST.Expression.Expression;
import AST.Expression.PostfixPart;
import AST.Statement.Statement;

public class PropertyAccess implements PostfixPart, Expression
{
    private final String _property;
    public PropertyAccess(String property)
    {
        _property = property;
    }
    public String getProperty()
    {
        return _property;
    }
    @Override
    public String toString()
    {
        return "." + _property;
    }
}

