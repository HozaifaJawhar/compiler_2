package App;

import AST.ASTNode;
import AST.Program;
import Semantic.SemanticError;
import Visitor.AngularCompVisitor;
import antlr.AngularLexer;
import antlr.AngularParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import generator.AngularCodeGenerator;
import generator.AngularCodeGenerator.GenOptions;

import java.nio.file.*;
import java.util.Map;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            // تحديد الملف المدخل
            String inputFile = "test/test_main.txt"; // استبدل بالمسار الفعلي للملف
            CharStream input = CharStreams.fromFileName(inputFile);

            // إعداد الـ Lexer و Parser
            AngularLexer lexer = new AngularLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(tokens);

            // تحليل الشجرة
            ParseTree tree = parser.program();

            // معالجة الـ AST باستخدام Visitor
            AngularCompVisitor visitor = new AngularCompVisitor();
            ASTNode ast = (ASTNode) visitor.visit(tree);

            System.out.println(ast);
            System.out.println();  // سطر فاصل بين الـ AST والمخرجات التالية

            System.out.println(visitor.s.toString());

            // التحقق من وجود أخطاء دلالية
            if (!visitor.errorReporter.getErrors().isEmpty()) {
                System.out.println("Semantic Errors found:");
                for (SemanticError error : visitor.errorReporter.getErrors()) {
                    System.out.println(error);
                }
            } else {
                System.out.println("No Semantic Errors detected.");
            }

            // ====== توليد الكود ======
            GenOptions options = new GenOptions();
            options.mode = AngularCodeGenerator.Mode.INLINE; // وضع INLINE لتطابق مع الاختبارات
            options.baseFileName = "CodeGenerated";  // اسم الملف الناتج بدون امتداد

            // إعداد مولد الكود
            AngularCodeGenerator codeGenerator = new AngularCodeGenerator(options);
            Map<String, String> files = codeGenerator.generate((Program) ast);  // تحويل الـ AST إلى Program

            // كتابة الملفات الناتجة إلى مجلد 'out_ts'
            Path outDir = Paths.get("out_ts");
            Files.createDirectories(outDir);  // إنشاء مجلد الخرج إذا لم يكن موجودًا

            // طباعة الكود المولد في الملفات
            for (Map.Entry<String, String> entry : files.entrySet()) {
                Path filePath = outDir.resolve(entry.getKey());
                Files.writeString(filePath, entry.getValue());
                System.out.println("Generated: " + filePath);
            }

            System.out.println("Code generation completed successfully!");

        } catch (IOException e) {
            System.err.println("Failed to read input file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Parsing error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}