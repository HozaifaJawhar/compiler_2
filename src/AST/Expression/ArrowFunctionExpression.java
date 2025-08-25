package AST.Expression;

import AST.Expression.Expression;

import java.util.List;

public class ArrowFunctionExpression implements Expression {
    private final List<String> _params;
    private final Expression _body;
    public ArrowFunctionExpression(List<String> params, Expression body)
    {
        this._params = params;
        this._body = body;
    }
    public List<String> getParams() {
        return _params;
    }
    public Expression getBody() {
        return _body;
    }
    @Override
    public String toString()
    {
        String params = String.join(", ", _params);
        return "(" + params + ") => " + _body.toString();
    }

}
