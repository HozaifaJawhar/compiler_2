package AST.Types;

import AST.ASTNode;
import AST.Statement.Statement;

import java.util.List;

public class Block implements Statement
{
    private final List<Statement> _statements;
    public Block(List<Statement> statements)
    {
         _statements = statements;
    }
    public List<Statement> getStatements()
    {
        return _statements;
    }
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("{\n");
        for (Statement stmt : _statements) {
            builder.append("  ").append(stmt.toString()).append("\n");
        }
        builder.append("}");
        return builder.toString();
    }
}
