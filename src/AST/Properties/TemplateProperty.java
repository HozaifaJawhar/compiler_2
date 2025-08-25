package AST.Properties;

import AST.Expression.TemplateLiteral;

public class TemplateProperty implements ComponentProperty {

    private final TemplateLiteral _template;

    public TemplateProperty(TemplateLiteral template) {
        this._template = template;
    }

    public TemplateProperty(String backtickTokenText) {
        this._template = new TemplateLiteral(backtickTokenText);
    }

    public TemplateLiteral getTemplateLiteral() {
        return _template;
    }

    public String getRawTemplate() {
        return _template.getRaw();
    }

    @Deprecated
    public String getTemplate() {
        return _template.getRaw();
    }

    @Override
    public String toString() {
        return "TemplateProperty";
    }
}
