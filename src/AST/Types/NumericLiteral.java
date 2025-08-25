package AST.Types;

import AST.Expression.Expression;

public class NumericLiteral implements Expression
{
    private final double _value;
    public NumericLiteral(double value)
    {
        _value = value;
    }
    public double getValue()
    {
        return _value;
    }
    public String toString()
    {
        return Double.toString(_value);
    }
}