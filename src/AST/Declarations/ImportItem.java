package AST.Declarations;

import AST.ASTNode;

public class ImportItem implements ASTNode
{
    private final String _identifier;
    public ImportItem(String identifier)
    {
        _identifier = identifier;
    }
    public String getIdentifier()
    {
        return _identifier;
    }
    @Override
    public String toString()
    {
        return _identifier;
    }

}
