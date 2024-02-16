package usfx.structures.linkedlists;

import usfx.structures.interfaces.IRunner;

public class DoublyLinkedListRunner implements IRunner {
    @Override
    public void run() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        //list.addAfter(list.find(2), 4);
        list.print();

    }
}
