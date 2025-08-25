package App;

import AST.ASTNode;
import Semantic.SemanticError;
import Visitor.AngularCompVisitor;
import antlr.AngularLexer;
import antlr.AngularParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

public class Main {
    public static void main(String[] args)
    {
        try {
            String inputFile = "test/test_main.txt";

            CharStream input = CharStreams.fromFileName(inputFile);

            AngularLexer lexer = new AngularLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            AngularParser parser = new AngularParser(tokens);

            ParseTree tree = parser.program();

            AngularCompVisitor visitor = new AngularCompVisitor();

            ASTNode ast = (ASTNode) visitor.visit(tree);

            System.out.println(ast);
            System.out.println();

            System.out.println(visitor.s.toString());

            if (!visitor.errorReporter.getErrors().isEmpty()) {
                System.out.println("Semantic Errors found:");
                for (SemanticError error : visitor.errorReporter.getErrors()) {
                    System.out.println(error);
                }
            } else {
                System.out.println("No Semantic Errors detected.");
            }

        } catch (IOException e) {
            System.err.println("Failed to read input file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Parsing error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
//sdfa