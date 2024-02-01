package usfx.structures.stacks;

import usfx.structures.interfaces.IStack;
import usfx.structures.linkedlists.LinkedList;
import usfx.structures.linkedlists.Nodo;

public class LinkedListStack<T> implements IStack<T> {

    private LinkedList<T> list = new LinkedList<>();
    Nodo<T> top;


    @Override
    public void push(T data) {
        list.addFirst(data);
    }

    @Override
    public Nodo<T> pop() {
        if (isEmpty()) {
            return null;
        }
        Nodo<T> temp = list.first();
        list.removeFirst();
        return temp;
    }

    @Override
    public Nodo<T> top() {
        if (isEmpty()) {
            return null;
        }
        return list.first();

    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void print() {
        //print the stack
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        list.print();
    }
}
