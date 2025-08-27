package AST.Types;

import AST.ASTNode;

public class ArrayType implements ASTNode {
    private final ASTNode _elementType;

    public ArrayType(ASTNode elementType) {
        this._elementType = elementType;
    }

    public ASTNode getElementType() {
        return _elementType;
    }

    @Override
    public String toString() {
        return _elementType.toString() + "[]";
    }
}
