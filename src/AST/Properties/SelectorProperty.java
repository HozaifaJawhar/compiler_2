package AST.Properties;

import AST.Properties.ComponentProperty;

public class SelectorProperty implements ComponentProperty
{
    private final String _value;
    public SelectorProperty(String value)
    {
        _value = value;
    }
    public String getValue()
    {
        return _value;
    }
    @Override
    public String toString()
    {
        return "SelectorProperty";
    }
}
