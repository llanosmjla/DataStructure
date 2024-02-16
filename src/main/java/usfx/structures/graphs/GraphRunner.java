package usfx.structures.graphs;
import usfx.structures.interfaces.IRunner;

import javax.script.ScriptContext;
import java.util.Scanner;

public class GraphRunner implements IRunner {
    @Override
    public void run() {
        Graph graph = new Graph(true);
        Scanner input = new Scanner(System.in);
        int option;
        do {
            subMenu();
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("*** Add Vertex ***");
                    System.out.println("Enter the vertex to add: ");
                    int vertex = input.nextInt();
                    graph.addVertex(vertex);
                    break;
                case 2:
                    System.out.println("*** Add Edge ***");
                    System.out.println("Enter the source vertex: ");
                    int source = input.nextInt();
                    System.out.println("Enter the destination vertex: ");
                    int destination = input.nextInt();
                    System.out.println("Enter the weight: ");
                    int weight = input.nextInt();
                    graph.addEdge(source, destination, weight);
                    break;
                case 3:
                    System.out.println("*** Delete Vertex ***");
                    System.out.println("Enter the vertex to delete: ");
                    int vertexDelete = input.nextInt();
                    graph.deleteVertex(vertexDelete);
                    break;
                case 4:
                    System.out.println("*** Delete Edge ***");
                    System.out.println("Enter the source vertex: ");
                    int sourceDelete = input.nextInt();
                    System.out.println("Enter the destination vertex: ");
                    int destinationDelete = input.nextInt();
                    graph.deleteEdge(sourceDelete, destinationDelete);
                    break;
                case 5:
                    System.out.println("*** Print ***");
                    graph.print();
                    break;
                case 6:
                    System.out.println("*** Size ***");
                    System.out.println("Size: " + graph.size());
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (option != 7);
    }

    public void subMenu() {
        System.out.println("-************ Graph Menu ************-");
        System.out.println("1. Add Vertex");
        System.out.println("2. Add Edge");
        System.out.println("3. Delete Vertex");
        System.out.println("4. Delete Edge");
        System.out.println("5. Print");
        System.out.println("6. Size");
        System.out.println("7. Exit");
    }
}
