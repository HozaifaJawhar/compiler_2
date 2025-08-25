package AST.Declarations;

import AST.ASTNode;

import java.util.List;

public class ImportItems implements ASTNode
{
    private final List<ImportItem> _items;
    public ImportItems(List<ImportItem> items)
    {
        _items = items;
    }
    public List<ImportItem> getItems()
    {
        return _items;
    }
    @Override
    public String toString()
    {
        return _items.stream()
                .map(Object::toString)
                .reduce((a, b) -> a + ", " + b)
                .map(s -> "{ " + s + " }")
                .orElse("{}");
    }

}
