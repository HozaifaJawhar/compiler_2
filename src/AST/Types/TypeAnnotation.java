package AST.Types;

import AST.ASTNode;

public class TypeAnnotation {
    private final ASTNode _type;

    public TypeAnnotation(ASTNode type) {
        this._type = type;
    }

    public ASTNode getType() {
        return _type;
    }

    @Override
    public String toString() {
        return _type == null ? "" : _type.toString();
    }
}
