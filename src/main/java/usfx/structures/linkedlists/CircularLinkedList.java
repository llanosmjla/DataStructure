package usfx.structures.linkedlists;

import usfx.structures.interfaces.ILinkedList;

public class CircularLinkedList<T> implements ILinkedList<T> {
    Nodo<T> tail;
    @Override
    public int size() {
        if(isEmpty()){
            return 0;
        }
        int size = 1;
        Nodo<T> current = tail.next;
        while(current != tail){
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return tail == null;
    }

    @Override
    public Nodo<T> first() {
        if (isEmpty()){
            return null;
        }
        return tail.next;
    }

    @Override
    public Nodo<T> last() {
        if (isEmpty()){
            return null;
        }
        return tail;
    }


    @Override
    public void addFirst(T data) {
        if (isEmpty()){
            tail = new Nodo<T>(data);
            tail.next = tail;
            return;
        }
        Nodo<T> newNode = new Nodo<T>(data);
        newNode.next = tail.next;
        tail.next = newNode;
    }

    @Override
    public void addLast(T data) {
        if (isEmpty()){
            tail = new Nodo<T>(data);
            tail.next = tail;
            return;
        }
        Nodo<T> newNode = new Nodo<T>(data);
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }

    @Override
    public void removeFirst() {
        if (isEmpty()){
            return;
        }
        if (tail.next == tail){
            tail = null;
            return;
        }
        tail.next = tail.next.next;
    }

    @Override
    public void print() {
        if(isEmpty()){
            return;
        }
        Nodo<T> current = tail.next;
        while(current != tail){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(tail.data);

    }
}
