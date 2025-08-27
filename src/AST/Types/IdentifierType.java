package AST.Types;

import AST.ASTNode;

public class IdentifierType implements ASTNode {
    private final String _name;

    public IdentifierType(String name) {
        this._name = name;
    }

    public String getName() {
        return _name;
    }

    @Override
    public String toString() {
        return _name;
    }
}