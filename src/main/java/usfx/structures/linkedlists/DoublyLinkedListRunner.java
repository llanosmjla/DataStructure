package usfx.structures.linkedlists;

import usfx.structures.interfaces.IRunner;

public class DoublyLinkedListRunner implements IRunner {
    @Override
    public void run() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.print();

    }
}
