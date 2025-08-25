package AST.Types;

public class IdentifierType implements TypePrimary
{
    private final String _name;
    public IdentifierType(String name)
    {
        _name = name;
    }
    public String getName()
    {
        return _name;
    }
}

