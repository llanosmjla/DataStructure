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
        array[++s] = data;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        var data = array[s];
        array[s--] = null;
        return data;
    }

    @Override
    public T top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return array[s];
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
        for (int i = size()-1; i >= 0; i--) {
            System.out.println("["+ i + "] : " + array[i]);
        }
    }
}
