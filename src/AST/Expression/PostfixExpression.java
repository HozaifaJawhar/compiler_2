package AST.Expression;

import java.util.ArrayList;
import java.util.List;

public class PostfixExpression implements Expression {
    private final Expression base;
    private final List<PostfixPart> parts;

    public PostfixExpression(Expression base, List<?> parts) {
        this.base = base;
        List<PostfixPart> tmp = new ArrayList<>();
        if (parts != null) {
            for (Object p : parts) {
                if (p instanceof PostfixPart) {
                    tmp.add((PostfixPart) p);
                }

            }
        }
        this.parts = tmp;
    }

    public Expression getBase() {
        return base;
    }

    public List<PostfixPart> getParts() {
        return parts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.valueOf(base));
        for (PostfixPart part : parts) {
            sb.append(part.toString());
        }
        return sb.toString();
    }
}
