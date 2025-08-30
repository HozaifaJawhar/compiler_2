package SymbolTable;

import java.util.*;

public class SymbolTable
{
    private Map<String, SymbolTableInfo> symbolTable;

    public SymbolTable() {
        this.symbolTable = new HashMap<>();
    }

    public void addVariable(String variableName, String type, Object value, String scope) {
        if (symbolTable.containsKey(variableName)) {
            System.out.println("Error: Variable " + variableName + " already declared.");
            return;
        }
        SymbolTableInfo info = new SymbolTableInfo(variableName, type, value, scope);
        symbolTable.put(variableName, info);
    }

    public void updateVariable(String variableName, Object newValue) {
        SymbolTableInfo info = symbolTable.get(variableName);
        if (info != null) {
            info.setValue(newValue);
        } else {
            System.out.println("Variable " + variableName + " does not exist in the symbol table!");
        }
    }

    public SymbolTableInfo getSymbolInfo(String variableName) {
        if (symbolTable.containsKey(variableName)) {
            return symbolTable.get(variableName);
        } else {

            return null;
        }
    }

    public Object getValue(String variableName) {
        SymbolTableInfo info = getSymbolInfo(variableName);
        return info != null ? info.getValue() : null;
    }

    @Override
    public String toString() {
        if (symbolTable.isEmpty()) {
            return "Symbol Table is empty.";
        }

        StringBuilder builder = new StringBuilder();

        // ✅ تم تعديل طول الخط هنا من 140 إلى 144 ليطابق عرض الأعمدة
        String horizontalLine = "─".repeat(144);

        // عرض الأعمدة: 10 + 25 + 30 + 40 + 25 = 130 للمحتوى
        // + (2*5 لل padding) + (6 | للفواصل) = 146 العرض الكلي
        // الخط الأفقي يكون 146 - 2 (للزوايا) = 144
        String header = String.format("│ %-10s │ %-25s │ %-30s │ %-40s │ %-25s │", "ID", "Variable Name", "Type", "Value", "Scope");

        builder.append("┌").append(horizontalLine).append("┐\n");
        builder.append(header).append("\n");
        builder.append("├").append(horizontalLine).append("┤\n");

        int id = 1;
        for (Map.Entry<String, SymbolTableInfo> entry : symbolTable.entrySet()) {
            SymbolTableInfo info = entry.getValue();
            String valueStr = (info.getValue() != null) ? info.getValue().toString() : "null";
            // اقتصاص القيمة الطويلة لتجنب تشويه الجدول
            if (valueStr.length() > 38) {
                valueStr = valueStr.substring(0, 35) + "...";
            }

            builder.append(String.format("│ %-10d │ %-25s │ %-30s │ %-40s │ %-25s │",
                    id++, info.getName(), info.getType(), valueStr, info.getScope()));
            builder.append("\n");
        }

        builder.append("└").append(horizontalLine).append("┘\n");
        return builder.toString();
    }
}
