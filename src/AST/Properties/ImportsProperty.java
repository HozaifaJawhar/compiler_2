package AST.Properties;

import AST.ASTNode;
import AST.Properties.ComponentProperty;

import java.util.List;

public class ImportsProperty implements ComponentProperty
{
    private final List<ASTNode> _imports;
    public ImportsProperty(List<ASTNode> imports)
    {
        _imports = imports;
    }
    public List<ASTNode> getImports()
    {
        return _imports;
    }
    @Override
    public String toString()
    {
        return "ImportsProperty";
    }
}
