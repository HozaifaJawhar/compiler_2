package AST.Statement;

import java.util.List;
public class BlockStatement implements Statement
{
    private final List<Statement> _statements;
    public BlockStatement(List<Statement> statements)
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

        for (Statement stmt : _statements) {
            builder.append(stmt.toString() + "\n");
        }

        return builder.toString();
    }
}
