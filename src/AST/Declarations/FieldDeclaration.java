package AST.Declarations;

import AST.Expression.Expression;
import AST.Types.TypeAnnotation;

public class FieldDeclaration implements ClassMember
{
    private final String _name;
    private final TypeAnnotation _type;
    private final Expression _initializer;
    public FieldDeclaration(String name, TypeAnnotation type, Expression initializer)
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
        StringBuilder sb = new StringBuilder();
        sb.append("FieldMember( Identifier = " + _name);
        if (_type != null) {
            sb.append(", Type = ").append(_type.toString());
        }
        if (_initializer != null) {
            sb.append(", Value = ").append(_initializer.toString());
        }
        sb.append(" )");
        return sb.toString();
    }
}