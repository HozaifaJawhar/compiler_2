package AST.Expression;

import AST.Properties.ObjectProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectExpression implements Expression {

    public sealed interface Element permits PropertyElement, SpreadElement { }

    public static final class PropertyElement implements Element {
        private final ObjectProperty property;
        public PropertyElement(ObjectProperty property) { this.property = property; }
        public ObjectProperty getProperty() { return property; }
        @Override public String toString() { return property.toString(); }
    }

    public static final class SpreadElement implements Element {
        private final Expression source;
        public SpreadElement(Expression source) { this.source = source; }
        public Expression getSource() { return source; }
        @Override public String toString() { return "..." + source.toString(); }
    }

    private final List<Element> elements;

    public ObjectExpression(List<Element> elements) {
        this.elements = elements == null ? new ArrayList<>() : elements;
    }

    public List<ObjectProperty> getProperties() {
        List<ObjectProperty> props = new ArrayList<>();
        for (Element e : elements) {
            if (e instanceof PropertyElement pe) {
                props.add(pe.getProperty());
            }
        }
        return props;
    }

    public List<Element> getElements() { return elements; }

    @Override
    public String toString() {
        String inner = elements.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        return "{" + inner + "}";
    }
}
