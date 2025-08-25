package AST.Declarations;

import AST.ASTNode;

public class ComponentDefinition implements ASTNode
{
    private final ComponentConfig _componentConfig;
    private final ClassDeclaration _classDeclaration;
    public ComponentDefinition(ComponentConfig componentConfig, ClassDeclaration classDeclaration)
    {
        _componentConfig = componentConfig;
        _classDeclaration = classDeclaration;
    }
    public ComponentConfig getComponentConfig()
    {
        return _componentConfig;
    }
    public ClassDeclaration getClassDeclaration()
    {
        return _classDeclaration;
    }
    @Override
    public String toString()
    {
        return "ComponentDefinition \n{" +
                "\nComponentConfig \n{\n" + _componentConfig +
                "\nClassDeclaration \n{\n" + _classDeclaration +
                "\n}";
    }
}
