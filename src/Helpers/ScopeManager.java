package Helpers;

import java.util.ArrayDeque;
import java.util.Deque;

public class ScopeManager {
    private Deque<String> scopeStack = new ArrayDeque<>();

    public void enterScope(String scopeName) {
        scopeStack.push(scopeName);
    }

    public void exitScope() {
        scopeStack.pop();
    }

    public String getCurrentScope() {
        return scopeStack.peek();
    }
}

