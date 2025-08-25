package AST.Declarations;

import AST.ASTNode;
import AST.Types.ClassBody;

public class ClassDeclaration implements ASTNode
{
    private final boolean _isExported;
    private final String _className;
    private final ClassBody _classBody;
    public ClassDeclaration(boolean isExported, String className, ClassBody classBody)
    {
        _isExported = isExported;
        _className = className;
        _classBody = classBody;
    }
    public ClassBody getClassBody()
    {
        return _classBody;
    }
    public boolean isExported()
    {
        return _isExported;
    }
    public String getClassName()
    {
        return _className;
    }
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        builder.append("Class ( " + _className + ", " + _isExported + " ) \n{")
               .append("\n" + _classBody.toString() + "}");

        return builder.toString();
    }
}
