package AST.Declarations;

import AST.Statement.BlockStatement;
import AST.Types.TypeAnnotation;
import java.util.ArrayList;
import java.util.List;

public class MethodDeclaration implements ClassMember {
    private final String _methodName;
    private final TypeAnnotation _returnType;
    private final BlockStatement _block;
    private final List<Parameter> _parameters;

    public MethodDeclaration(String methodName, TypeAnnotation returnType, BlockStatement block, List<Parameter> parameters) {
        this._methodName = methodName;
        this._returnType = returnType;
        this._block = block;
        this._parameters = (parameters == null) ? new ArrayList<>() : parameters;
    }

    public String getMethodName() { return _methodName; }
    public TypeAnnotation getReturnType() { return _returnType; }
    public BlockStatement getBlock() { return _block; }
    public List<Parameter> getParameters() { return _parameters; }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MethodMember( Identifier = ").append(_methodName)
                .append(", ReturnType = ").append(_returnType == null ? "null" : _returnType.toString())
                .append(", Parameters = [ ");

        for (int i = 0; i < _parameters.size(); i++) {
            builder.append(_parameters.get(i).toString());
            if (i < _parameters.size() - 1) builder.append(", ");
        }

        builder.append(" ] \n{\n")
                .append(_block == null ? "" : _block.toString())
                .append("}");

        return builder.toString();
    }
}
