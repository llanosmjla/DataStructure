package usfx.structures.linkedlists;

import usfx.structures.interfaces.IDoublyLinkedList;

public class DoublyLinkedList<T> implements IDoublyLinkedList<T> {

    DoublyNodo<T> head;
    DoublyNodo<T> tail;
    @Override
    public int size() {
        if (isEmpty()){
            return 0;
        }
        int size = 0;
        DoublyNodo<T> current = head;
        while (current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public DoublyNodo<T> first() {
        return head;
    }

    @Override
    public DoublyNodo last() {
        if (isEmpty()){
            System.out.println("List is empty");
            return null;
        }
        DoublyNodo<T> current = head;
        while (current != null){
            current = current.next;
        }
        return current;
    }

    @Override
    public void addFirst(T data) {
        DoublyNodo<T> newNode = new DoublyNodo<T>(data);
        if (isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }

    @Override
    public void addLast(T data) {
        DoublyNodo<T> lastNode = last();
        lastNode.next = new DoublyNodo<T>(data);
        lastNode.next.previous = lastNode;

    }

    @Override
    public void print() {
        DoublyNodo<T> current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
