package usfx.structures.interfaces;
import usfx.structures.linkedlists.Nodo;
public interface IStack<T>{
    /**
     * Method push, adds an element to the top of the stack
     */
    void push(T data);
    /**
     * Method pop, removes the element at the top of the stack
     */
    T pop();
    /**
     * Method top, returns the element at the top of the stack
     */
    T top();
    /**
     * Method isEmpty, returns true if the stack is empty
     */
    boolean isEmpty();
    /**
     * Method size, returns the size of the stack
     */
    int size();
    /**
     * Method print, prints the stack
     */
    void print();
    //implment the method peek
    //implement the method search
}
