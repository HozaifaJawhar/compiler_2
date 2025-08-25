package AST.Statement;

import AST.ASTNode;
import AST.Declarations.ImportItem;

import java.util.List;

public class ImportStatement implements ASTNode
{
    private final List<ImportItem> _importItems;
    private final String _modulePath;
    public ImportStatement(List<ImportItem> importItems, String modulePath)
    {
        _importItems = importItems;
        _modulePath = modulePath;
    }
    public List<ImportItem> getImportItems()
    {
        return _importItems;
    }
    public String getModulePath()
    {
        return _modulePath;
    }
    @Override
    public String toString()
    {
        return "ImportStatement";
    }
}
