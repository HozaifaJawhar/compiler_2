package AST.Statement;

import AST.Expression.Expression;
import AST.Types.TypeAnnotation;

public class VariableDeclarationStatement implements Statement
{
    private final String _name;
    private final TypeAnnotation _type; // can be null
    private final Expression _initializer; // can be null
    public VariableDeclarationStatement(String name, TypeAnnotation type, Expression initializer)
    {
        _name = name;
        _type = type;
        _initializer = initializer;
    }
    public String getName()
    {
        return _name;
    }
    public TypeAnnotation getType()
    {
        return _type;
    }
    public Expression getInitializer()
    {
        return _initializer;
    }
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("VariableDeclarationStatement( Name = " + _name + ", Type = " + _type + ", Value = " + _initializer + " )");
        return builder.toString();
    }
}
