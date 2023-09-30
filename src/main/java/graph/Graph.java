package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public boolean addVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2) {
        if(!adjList.containsKey(vertex1) || !adjList.containsKey(vertex2)) {
            return false;
        }
        if(!adjList.get(vertex1).contains(vertex2)) {
            adjList.get(vertex1).add(vertex2);
        }
        if(!adjList.get(vertex2).contains(vertex1)) {
            adjList.get(vertex2).add(vertex1);
        }

        return true;
    }

    public boolean removeEdge(String vertex1, String vertex2) {
        if(!adjList.containsKey(vertex1) || !adjList.containsKey(vertex2)) {
            return false;
        }

        adjList.get(vertex1).remove(vertex2);
        adjList.get(vertex2).remove(vertex1);

        return true;
    }

    public boolean removeVertex(String vertex) {
        if(!adjList.containsKey(vertex)) {
            return false;
        }

        ArrayList<String> edges = adjList.get(vertex);
        for (String s : edges) {
            adjList.get(s).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }
}
