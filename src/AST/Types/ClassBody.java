package AST.Types;

import AST.ASTNode;
import AST.Declarations.ClassDeclaration;
import AST.Declarations.ClassMember;

import java.util.List;
public class ClassBody implements ASTNode
{
    private final List<ClassMember> _classMembers;

    public ClassBody(List<ClassMember> classMembers)
    {
        _classMembers = classMembers;
    }
    public List<ClassMember> getClassMembers()
    {
        return _classMembers;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        for (ClassMember member : _classMembers) {
            builder.append(member.toString()).append("\n");
        }
        return builder.toString();
    }
}
