package Helpers;

import java.util.*;

public class CycleDetector {
    private final Map<String, List<String>> _graph;
    private final Set<String> _visited;
    private final Set<String> _recStack;

    public CycleDetector(Map<String, List<String>> graph) {
        _graph = graph;
        _visited = new HashSet<>();
        _recStack = new HashSet<>();
    }
    public boolean hasCycle() {
        for (String node : _graph.keySet()) {
            if (!_visited.contains(node)) {
                if (DFS(node)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean DFS(String node) {
        _visited.add(node);
        _recStack.add(node);

        List<String> neighbors = _graph.getOrDefault(node, Collections.emptyList());
        for (String neighbor : neighbors) {
            if (!_visited.contains(neighbor)) {
                if (DFS(neighbor)) {
                    return true;
                }
            } else if (_recStack.contains(neighbor)) {
                return true;
            }
        }

        _recStack.remove(node);
        return false;
    }
}

