package usfx.structures.graphs;

public class GraphNode {
    /**
     * vertex is the vertex of the graph
     * @param vertex
     */
    private int vertex;
    /**
     * weight is the weight of the edge
     * @param weight
     */
    private int weight;

    public GraphNode(int vertex, int weight){
        this.vertex = vertex;
        this.weight = weight;
    }

    public int getVertex() {
        return vertex;
    }

    public int getWeight() {
        return weight;
    }

}
