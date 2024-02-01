package usfx.structures.linkedlists;

import usfx.structures.interfaces.IRunner;

public class CircularLinkedListRunner implements IRunner {

    @Override
    public void run() {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.print();
    }
}
