package AST.Types;

import AST.ASTNode;

public class AnyType implements ASTNode {
    public static final AnyType INSTANCE = new AnyType();
    private AnyType() { }
    @Override
    public String toString() {
        return "any";
    }
}