package usfx.structures.queues;

import usfx.structures.interfaces.IQueue;
import usfx.structures.linkedlists.LinkedList;

public class LinkedListQueue<T> implements IQueue<T> {
    LinkedList<T> listQueue = new LinkedList<>();


    @Override
    public void enqueue(T data) {
        listQueue.addLast(data);
    }

    @Override
    public T dequeue() {
        T data = listQueue.first().data;
        listQueue.removeFirst();
        return data;
    }

    @Override
    public T first() {
        return listQueue.first().data;
    }

    @Override
    public boolean isEmpty() {
        return listQueue.isEmpty();
    }

    @Override
    public int size() {
        return listQueue.size();
    }

    // method to print the queue
    @Override
    public void print() {
        listQueue.print();
    }
}
