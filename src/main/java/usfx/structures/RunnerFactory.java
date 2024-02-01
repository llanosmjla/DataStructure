package usfx.structures;

import usfx.structures.interfaces.IRunner;
import usfx.structures.linkedlists.CircularLinkedListRunner;
import usfx.structures.linkedlists.DoublyLinkedListRunner;
import usfx.structures.linkedlists.LinkedListRunner;
import usfx.structures.queues.QueueRunner;
import usfx.structures.stacks.StackRunner;

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
        return new NullRunner();
    }
}
