package AST.Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PostfixExpression implements Expression {
    private final Expression base;
    private final List<PostfixPart> parts;

    public PostfixExpression(Expression base, List<PostfixPart> parts) {
        this.base = base;
        // فلترة null لحماية toString وأي استخدام لاحق
        this.parts = (parts == null)
                ? new ArrayList<>()
                : parts.stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    public Expression getBase() { return base; }
    public List<PostfixPart> getParts() { return parts; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(base == null ? "/*null-base*/" : base.toString());
        for (PostfixPart part : parts) {
            if (part == null) continue; // أمان إضافي
            sb.append(part.toString());
        }
        return sb.toString();
    }
}
