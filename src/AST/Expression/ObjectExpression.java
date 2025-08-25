package AST.Expression;

import AST.Properties.ObjectProperty;

import java.util.List;
import java.util.stream.Collectors;

public class ObjectExpression implements Expression {
    private final List<ObjectProperty> _properties;
    public ObjectExpression(List<ObjectProperty> properties)
    {
        _properties = properties;
    }
    public List<ObjectProperty> getProperties()
    {
        return _properties;
    }
    @Override
    public String toString()
    {
        String props = _properties.stream()
                .map(ObjectProperty::toString)
                .collect(Collectors.joining(", "));
        return "{" + props + "}";
    }
}
