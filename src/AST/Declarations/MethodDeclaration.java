package AST.Declarations;

import AST.Statement.BlockStatement;
import AST.Types.Block;
import AST.Types.TypeAnnotation;

import java.util.List;

public class MethodDeclaration implements ClassMember
{
    private final String _methodName;
    private final TypeAnnotation _returnType;
    private final BlockStatement _block;
    private final List<Parameter> _parameters;
    public MethodDeclaration(String methodName, TypeAnnotation returnType, BlockStatement block, List<Parameter> parameters)
    {
        _methodName = methodName;
        _block = block;
        _parameters = parameters;
        _returnType = returnType;
    }
    public String getMethodName()
    {
        return _methodName;
    }
    public TypeAnnotation getReturnType()
    {
        return _returnType;
    }
    public BlockStatement getBlock()
    {
        return _block;
    }
    public List<Parameter> getParameters()
    {
        return _parameters;
    }
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        builder.append("MethodMember( Identifier = " + _methodName)
               .append(", ReturnType = " + _returnType)
               .append(", Parameters = [ ");

        for(Parameter parameter : _parameters) {
            if(!_parameters.get(_parameters.size() - 1).equals(parameter)) {
                builder.append(parameter.toString() + ", ");
            }
            else {
                builder.append(parameter.toString() + " ");
            }
        }

        builder.append("] \n{\n")
               .append(_block.toString())
               .append("}");

        return builder.toString();
    }
}
