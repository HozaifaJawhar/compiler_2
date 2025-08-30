package generator;

public class CodeWriter {
    private final StringBuilder sb = new StringBuilder();
    private int indent = 0;
    private final String indentUnit = "  ";

    public CodeWriter write(String s) {
        sb.append(s);
        return this;
    }

    public CodeWriter writeln(String s) {
        indent();
        sb.append(s).append('\n');
        return this;
    }

    public CodeWriter newline() {
        sb.append('\n');
        return this;
    }

    public CodeWriter openBlock() {
        writeln("{");
        indent++;
        return this;
    }

    public CodeWriter closeBlock() {
        indent = Math.max(0, indent - 1);
        writeln("}");
        return this;
    }

    private void indent() {
        for (int i = 0; i < indent; i++) sb.append(indentUnit);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
