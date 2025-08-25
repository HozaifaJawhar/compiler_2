package AST.Declarations;

import java.util.List;
import AST.ASTNode;
import AST.Types.ObjectTypeMember;
import java.util.StringJoiner;

public class InterfaceDeclaration implements ASTNode {

    private final boolean _exported;
    private final String _name;
    private final List<ObjectTypeMember> _members;

    public InterfaceDeclaration(boolean exported, String name, List<ObjectTypeMember> members) {
        this._exported = exported;
        this._name = name;
        this._members = members;
    }

    public boolean isExported() {
        return _exported;
    }

    public String getName() {
        return _name;
    }

    public List<ObjectTypeMember> getMembers() {
        return _members;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\n", "", "");
        for (ObjectTypeMember m : _members) {
            sj.add("  " + m.toString());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("InterfaceDeclaration ")
                .append(_exported ? "export " : "")
                .append(_name)
                .append("\n{\n")
                .append(sj.length() > 0 ? sj.toString() + "\n" : "")
                .append("}");

        return sb.toString();
    }
}
