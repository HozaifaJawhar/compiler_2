package SymbolTable;

public class SymbolTableInfo {
    private String _name;
    private String _type;
    private Object _value;
    private String _scope;

    public SymbolTableInfo(String name, String type, Object value, String scope) {
        _name = name;
        _type = type;
        _value = value;
        _scope = scope;
    }

    public String getName() { return _name; }
    public String getType() { return _type; }
    public Object getValue() { return _value; }
    public String getScope() { return _scope; }

    public void setValue(Object value) { _value = value; }
    public void setType(String type) { _type = type; }
    public void setScope(String scope) { _scope = scope; }

    @Override
    public String toString() {
        return "Type: " + _type + ", Value: " + _value + ", Scope: " + _scope;
    }
}
