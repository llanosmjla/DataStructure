package graphtests;

import org.junit.Test;
import usfx.structures.graphs.Graph;
import usfx.structures.interfaces.IGraph;

public class GraphTest {

    IGraph graph = new Graph(true);

    // Test addEdge is working
    @Test
    public void addEdge() {
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1, 2, 3);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 5);
        assert(graph.size() == 3);
    }

    // Test deleteEdge is working
    @Test
    public void deleteEdge() {
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1, 2, 3);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 5);
        graph.deleteEdge(2, 3);
        assert(graph.size() == 3);
    }

    // Test deleteVertex is working
    @Test
    public void deleteVertex() {
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1, 2, 3);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 5);
        graph.deleteVertex(2);
        assert(graph.size() == 2);
    }

    // Test addVertex is working
    @Test
    public void addVertex() {
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        assert(graph.size() == 3);
    }
}
