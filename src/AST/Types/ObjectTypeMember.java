package AST.Types;

import AST.ASTNode;

public class ObjectTypeMember implements ASTNode
{
    private final String _name;
    private final TypeAnnotation _type;
    public ObjectTypeMember(String name, TypeAnnotation type)
    {
        _name = name;
        _type = type;
    }
    public String getName()
    {
        return _name;
    }
    public TypeAnnotation getType()
    {
        return _type;
    }
    @Override
    public String toString()
    {
        return _name + ": " + _type;
    }
}
