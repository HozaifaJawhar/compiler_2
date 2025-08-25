package AST.Declarations;

import AST.ASTNode;
import AST.Properties.ComponentProperty;

import java.util.List;

public class ComponentConfig implements ASTNode
{
    private final List<ComponentProperty> _componentProperties;
    public ComponentConfig(List<ComponentProperty> componentProperties)
    {
        _componentProperties = componentProperties;
    }
    public List<ComponentProperty> getComponentProperties()
    {
        return _componentProperties;
    }
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        for(ComponentProperty prop : _componentProperties) {
            builder.append(prop.toString() + ",\n");
        }
        builder.append("}");
        return builder.toString();
    }
}
