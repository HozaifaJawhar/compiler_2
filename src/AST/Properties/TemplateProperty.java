package AST.Properties;

import AST.Properties.ComponentProperty;

public class TemplateProperty implements ComponentProperty
{
    private final String _template;
    public TemplateProperty(String template)
    {
        _template = template;
    }
    public String getTemplate() {
        return _template;
    }
    @Override
    public String toString()
    {
        return "TemplateProperty";
    }
}
