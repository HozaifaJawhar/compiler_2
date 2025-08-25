package AST.Expression;

import java.util.List;

public class PostfixExpression implements Expression {
    private final Expression base;
    private final List<PostfixPart> parts;

    public PostfixExpression(Expression base, List<PostfixPart> parts) {
        this.base = base;
        this.parts = parts;
    }

    public Expression getBase() {
        return base;
    }

    public List<PostfixPart> getParts() {
        return parts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(base.toString());
        for (PostfixPart part : parts) {
            sb.append(part.toString());
        }
        return sb.toString();
    }
}