package AST;

import AST.Declarations.ComponentDefinition;
import AST.Declarations.InterfaceDeclaration;
import AST.Statement.ImportStatement;

import java.util.Collections;
import java.util.List;

public class Program implements ASTNode {
    private final List<ImportStatement> _importStatements;
    private final List<InterfaceDeclaration> _interfaces;
    private final List<ComponentDefinition> _components;

    public Program(List<ImportStatement> importStatements,
                   List<InterfaceDeclaration> interfaces,
                   List<ComponentDefinition> components) {
        _importStatements = importStatements;
        _interfaces = interfaces;
        _components = components;
    }

    public Program(List<ImportStatement> importStatements,
                   List<ComponentDefinition> components) {
        this(importStatements, Collections.emptyList(), components);
    }

    public List<ImportStatement> getImportStatements() {
        return _importStatements;
    }

    public List<InterfaceDeclaration> getInterfaces() {
        return _interfaces;
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

        for (InterfaceDeclaration iface : _interfaces) {
            builder.append(iface.toString()).append("\n");
        }

        for (ComponentDefinition component : _components) {
            builder.append(component.toString()).append("\n");
        }

        builder.append("}");

        return builder.toString();
    }
}