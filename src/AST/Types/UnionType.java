package AST.Types;

import AST.ASTNode;

import java.util.List;
import java.util.stream.Collectors;

public class UnionType implements ASTNode {
    private final List<ASTNode> _options;

    public UnionType(List<ASTNode> options) {
        this._options = options;
    }

    public List<ASTNode> getOptions() {
        return _options;
    }

    @Override
    public String toString() {
        return _options.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" | "));
    }
}
