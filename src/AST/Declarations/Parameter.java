package AST.Declarations;

import AST.ASTNode;
import AST.Types.TypeAnnotation;

public class Parameter implements ASTNode
{
    private final String _name;
    private final TypeAnnotation _type;
    public Parameter(String name, TypeAnnotation type)
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
        return _name + " : " + _type;
    }
}
