package usfx.structures.interfaces;

public interface IGraph {
    void addEdge(int source, int destination, int weight);

    void deleteEdge(int source, int destination);

    void deleteVertex(int vertex);
    void addVertex(int vertex);
    void print();
    int size();
}
