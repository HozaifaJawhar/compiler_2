package AST.Declarations;

import AST.Expression.PostfixPart;

public class PostfixIncrement implements PostfixPart
{
    public PostfixIncrement() {}
    @Override
    public String toString()
    {
        return "++";
    }
}
