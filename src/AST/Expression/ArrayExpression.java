package AST.Expression;

import AST.Expression.Expression;

import java.util.List;

public class ArrayExpression implements Expression
{
    private final List<Expression> _elements;
    public ArrayExpression(List<Expression> elements)
    {
        this._elements = elements;
    }
    public List<Expression> getElements()
    {
        return _elements;
    }
    @Override
    public String toString()
    {
        return "[" + _elements.stream()
                .map(Object::toString)
                .collect(java.util.stream.Collectors.joining(", ")) + "]";
    }
}
