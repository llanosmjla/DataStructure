package usfx.structures.graphs;

import usfx.structures.interfaces.IGraph;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph implements IGraph {
    private HashMap<Integer, LinkedList<GraphNode>> graph;
    private boolean isDirected;

    public Graph(boolean isDirected) {
        graph = new HashMap<>();
        this.isDirected = isDirected;
    }

    public Graph() {
        graph = new HashMap<>();
        isDirected = false;
    }

    @Override
    public void addEdge(int source, int destination, int weight) {
        createEdge(source, destination, weight);
        if (!isDirected) {
            createEdge(destination, source, weight);
        }
    }
    private void createEdge(int source, int destination, int weight) {
        if (!graph.containsKey(source)) {
            graph.put(source, new LinkedList<>());
        }
        graph.get(source).add(new GraphNode(destination, weight));
    }

    @Override
    public void deleteEdge(int source, int destination) {
        deleteEdgeHelp(source, destination);
        if (!isDirected) {
            deleteEdgeHelp(destination, source);
        }
    }

    public void deleteEdgeHelp(int source, int destination) {
        LinkedList<GraphNode> list = graph.get(source);
        boolean bb = false;
        if (list != null) {
            for (int i = 0; i < list.size() && bb; i++) {
                GraphNode nodeCurrent = list.get(i);
                if (nodeCurrent.getVertex() == destination) {
                    list.remove(i);
                    bb = true;
                }
            }
        } else {
            System.out.println("The source vertex does not exist");
        }
    }

    @Override
    public void deleteVertex(int vertex) {
        LinkedList<GraphNode> list = graph.get(vertex);
        LinkedList<Integer> destinations = new LinkedList<>();
        for (GraphNode node : list) {
            destinations.add(node.getVertex());
        }
        graph.remove(vertex);
        for (int destination : destinations) {
            deleteEdgeHelp(destination, vertex);
        }
    }

    @Override
    public void addVertex(int vertex) {
        graph.put(vertex, new LinkedList<>());
    }

    @Override
    public void print() {
        for (int vertex : graph.keySet()) {
            System.out.print(vertex + " -> ");
            for (GraphNode node : graph.get(vertex)) {
                System.out.print(node.getVertex() + " ");
            }
            System.out.println();
        }
    }

    @Override
    public int size() {
        return graph.size();
    }

}
