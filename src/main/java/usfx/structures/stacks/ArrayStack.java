package usfx.structures.stacks;

import usfx.structures.interfaces.IStack;
import usfx.structures.linkedlists.Nodo;

public class ArrayStack<T> implements IStack<T> {
    private final T[] array;
    private static final int CAPACITY = 10;
    private int s = -1;

    public ArrayStack() {
        array = (T[]) new Object[CAPACITY];
    }

    public ArrayStack(int capacity) {
        array = (T[]) new Object[capacity];
    }


    @Override
    public void push(T data) {

    }

    @Override
    public Nodo<T> pop() {
        return null;
    }

    @Override
    public Nodo<T> top() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return s == -1;
    }

    @Override
    public int size() {
        return s + 1;
    }

    @Override
    public void print() {
        for (int i = 0; i <= s; i++) {
            System.out.println(array[i]);
        }
    }
}
