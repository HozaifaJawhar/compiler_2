package AST.Types;

import AST.ASTNode;
import java.util.List;
import java.util.StringJoiner;

public class InlineObjectType implements ASTNode {
    private final List<ObjectTypeMember> _members;

    public InlineObjectType(List<ObjectTypeMember> members) {
        this._members = members;
    }

    public List<ObjectTypeMember> getMembers() {
        return _members;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("; ");
        for (ObjectTypeMember m : _members) sj.add(m.toString());
        return "{ " + sj + " }";
    }
}
