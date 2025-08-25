package AST.Properties;

import AST.Properties.ComponentProperty;

public class StandaloneProperty implements ComponentProperty
{
    private final boolean _value;
    public StandaloneProperty(boolean value)
    {
        _value = value;
    }
    public boolean getValue()
    {
        return _value;
    }
    @Override
    public String toString()
    {
        return "StandaloneProperty";
    }
}
