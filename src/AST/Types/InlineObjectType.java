package AST.Types;

import java.util.List;

public class InlineObjectType implements TypePrimary
{
    private final List<ObjectTypeMember> _members;
    public InlineObjectType(List<ObjectTypeMember> members)
    {
        _members = members;
    }
    public List<ObjectTypeMember> getMembers()
    {
        return _members;
    }
    @Override
    public String toString()
    {
        return "{ " + String.join(", ", _members.stream().map(Object::toString).toList()) + " }";
    }
}
