package usfx.structures.queues;

import usfx.structures.interfaces.IDequeue;
import usfx.structures.linkedlists.DoublyLinkedList;
import usfx.structures.linkedlists.DoublyNodo;

public class Dequeue<T> implements IDequeue<T> {
    DoublyLinkedList<T> listDequeue = new DoublyLinkedList<>();
    @Override
    public void addFirst(T data) {
        listDequeue.addFirst(data);
    }

    @Override
    public void addLast(T data) {
        listDequeue.addLast(data);
    }
    @Override
    public T removeFirst() {
        if (listDequeue.isEmpty()){
            System.out.println("List is empty");
            return null;
        }
        T data = listDequeue.first().data;
        listDequeue.removeFirst();
        return data;
    }

    @Override
    public T removeLast() {
        if (listDequeue.isEmpty()){
            System.out.println("List is empty");
            return null;
        }
        T data = listDequeue.last().data;
        listDequeue.removeLast();
        return data;
    }

    @Override
    public T first() {
        if (listDequeue.isEmpty()){
            System.out.println("List is empty");
            return null;
        }
        return listDequeue.first().data;
    }

    @Override
    public T last() {
        if (listDequeue.isEmpty()){
            System.out.println("List is empty");
            return null;
        }
        return listDequeue.last().data;
    }

    @Override
    public int size() {
        return listDequeue.size();
    }

    @Override
    public boolean isEmpty() {
        return listDequeue.isEmpty();
    }

    @Override
    public void print(){
        listDequeue.print();
    }
}
