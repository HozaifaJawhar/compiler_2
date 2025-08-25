package AST.Types;

import AST.ASTNode;

import java.util.List;
import java.util.StringJoiner;

public class QualifiedName implements ASTNode
{
    private final List<String> _parts;
    public QualifiedName(List<String> parts) {
        _parts = parts;
    }
    public List<String> getParts() {
        return _parts;
    }
    @Override
    public String toString()
    {
        return String.join(".", _parts);
    }
}
