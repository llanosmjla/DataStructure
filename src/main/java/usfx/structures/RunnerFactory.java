package usfx.structures;

import usfx.structures.graphs.Graph;
import usfx.structures.graphs.GraphRunner;
import usfx.structures.interfaces.IRunner;
import usfx.structures.linkedlists.CircularLinkedListRunner;
import usfx.structures.linkedlists.DoublyLinkedListRunner;
import usfx.structures.linkedlists.LinkedListRunner;
import usfx.structures.queues.QueueRunner;
import usfx.structures.sorting.BubbleRunner;
import usfx.structures.sorting.BubbleSort;
import usfx.structures.sorting.MergeSortRunner;
import usfx.structures.sorting.QuickRunner;
import usfx.structures.stacks.StackRunner;
import usfx.structures.trees.BinaryTree;
import usfx.structures.trees.TreeRunner;

public class RunnerFactory {
    public static IRunner getIRunner(String structureID) {
        if(structureID.equals("A")){
            return new LinkedListRunner();
        }
        if(structureID.equals("B")){
            return new DoublyLinkedListRunner();
        }
        if(structureID.equals("C")){
            return new CircularLinkedListRunner();
        }
        if(structureID.equals("E")){
            return new StackRunner();
        }
        if(structureID.equals("F")){
            return new QueueRunner();
        }
        if (structureID.equals("G")) {
            return new TreeRunner();
        }
        if (structureID.equals("H")) {
            return new GraphRunner();
        }
        if (structureID.equals("I")) {
            return new BubbleRunner();
        }
        if (structureID.equals("J")) {
            return new QuickRunner();
        }
        if (structureID.equals("K")) {
            return new MergeSortRunner();
        }
        if (structureID.equals("Q")) {
            System.exit(0);
        }
        return new NullRunner();
    }
}
