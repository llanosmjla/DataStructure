package usfx.structures.stacks;

import usfx.structures.interfaces.IStack;
import usfx.structures.linkedlists.LinkedList;
import usfx.structures.linkedlists.Nodo;

public class LinkedListStack<T> implements IStack<T> {

    private LinkedList<T> list = new LinkedList<>();
    Nodo<T> top;


    @Override
    public void push(T data) {
        list.addLast(data);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        Nodo<T> temp = list.last();
        list.removeLast();
        return temp.data;
    }

    @Override
    public T top() {
        if (isEmpty()) {
            return null;
        }
        return list.last().data;

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
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("[" + i + "]: " + list.last().data);
            list.addFirst(list.last().data);
            list.removeLast();
        }
    }
}
