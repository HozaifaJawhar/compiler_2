package AST.Types;

import AST.ASTNode;

public class TypeAnnotation implements ASTNode
{
    private final TypePrimary _primaryType;
    private final boolean _isArray;
    public TypeAnnotation(TypePrimary primaryType, boolean isArray)
    {
        _primaryType = primaryType;
        _isArray = isArray;
    }
    public TypePrimary getPrimaryType()
    {
        return _primaryType;
    }
    public boolean isArray()
    {
        return _isArray;
    }
    @Override
    public String toString()
    {
        return _primaryType.toString() + (_isArray ? "[]" : "");
    }
}