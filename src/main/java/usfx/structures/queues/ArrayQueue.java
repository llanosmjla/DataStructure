package usfx.structures.queues;

import usfx.structures.interfaces.IQueue;

public class ArrayQueue<T> implements IQueue<T> {
    private final T[] arrayQueue;
    private static final int CAPACITY = 10;
    private int s = -1;
    public ArrayQueue() {
        arrayQueue = (T[]) new Object[CAPACITY];
    }
    public ArrayQueue(int capacity) {
        arrayQueue = (T[]) new Object[capacity];
    }
    @Override
    public void enqueue(T data) {
        arrayQueue[++s] = data;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        T data = arrayQueue[0];
        for (int i = 0; i < s; i++) {
            arrayQueue[i] = arrayQueue[i+1];
        }
        arrayQueue[s--] = null;
        return data;
    }

    @Override
    public T first() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return arrayQueue[0];
    }

    @Override
    public boolean isEmpty() {
        return s == -1;
    }

    @Override
    public int size() {
        return s+1;
    }
    @Override
    public void print(){
        for (int i = s; i >= 0; i--) {
            System.out.println("["+i+"]: " + arrayQueue[i]);
        }
    }
}
