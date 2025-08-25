package AST;

import AST.Declarations.ComponentDefinition;
import AST.Statement.ImportStatement;

import java.util.List;

public class Program implements ASTNode {
    private final List<ImportStatement> _importStatements;
    private final List<ComponentDefinition> _components;

    public Program(List<ImportStatement> importStatements, List<ComponentDefinition> components) {
        _importStatements = importStatements;
        _components = components;
    }

    public List<ImportStatement> getImportStatements() {
        return _importStatements;
    }

    public List<ComponentDefinition> getComponents() {
        return _components;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Program\n{\n");

        for (ImportStatement importStatement : _importStatements) {
            builder.append(importStatement.toString()).append("\n");
        }

        for (ComponentDefinition component : _components) {
            builder.append(component.toString()).append("\n");
        }

        builder.append("}");

        return builder.toString();
    }
}
