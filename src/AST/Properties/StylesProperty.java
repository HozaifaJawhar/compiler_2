package AST.Properties;

import AST.Properties.ComponentProperty;

import java.util.List;
public class StylesProperty implements ComponentProperty
{
    private final List<String> _styles;
    public StylesProperty(List<String> styles) {
        _styles = styles;
    }
    public List<String> getStyles() {
        return _styles;
    }
    public String getStylesString() {
        return _styles.toString();
    }
    @Override
    public String toString()
    {
        return "StylesProperty";
    }
}
