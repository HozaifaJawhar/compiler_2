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
            System.out.println("Variable " + variableName + " does not exist in the symbol table!");
            return null;
        }
    }

    public Object getValue(String variableName) {
        SymbolTableInfo info = getSymbolInfo(variableName);
        return info != null ? info.getValue() : null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Symbol Table:\n")
                .append("*").append("*".repeat(420)).append("*\n")
                .append(String.format("| %-10s | %-25s | %-30s | %-105s | %-25s \n", "ID", "VariableName", "Type", "Value", "Scope"))
                .append("*").append("*".repeat(420)).append("*\n");

        int id = 1;
        for (Map.Entry<String, SymbolTableInfo> entry : symbolTable.entrySet()) {
            SymbolTableInfo info = entry.getValue();
            String[] valueLines = String.valueOf(info.getValue()).split("\\n");
            String[] nameLines = info.getName().split("\\n");
            int maxLines = Math.max(valueLines.length, nameLines.length);

            builder.append(String.format("| %-10d | %-25s | %-30s | %-105s | %-25s \n",
                    id++, nameLines[0], info.getType(), valueLines[0], info.getScope()));

            for (int i = 1; i < maxLines; i++) {
                builder.append(String.format("| %-10s | %-25s | %-30s | %-105s | %-25s \n",
                        "", (i < nameLines.length) ? nameLines[i] : "",
                        "", (i < valueLines.length) ? valueLines[i] : "", ""));
            }

            builder.append("*").append("*".repeat(420)).append("*\n");
        }

        return builder.toString();
    }
}
