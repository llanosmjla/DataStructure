package usfx.structures.interfaces;
import usfx.structures.linkedlists.Nodo;

public interface IDequeue<T> {
    /**
     * Adds a new element to the front of the list
     * @param data the data to be added
     */
    void addFirst(T data);
    /**
     * Adds a new element to the end of the list
     * @param data the data to be added
     */
    void addLast(T data);
    /**
     * Removes the first element of the list
     * @return the removed element, null if the list is empty
     */
    T removeFirst();
    /**
     * Removes the last element of the list
     * @return the removed element, null if the list is empty
     */
    T removeLast();
    /**
     * Returns the first element of the list,
     * @return the first element, null if the list is empty
     */
    T first();
    /**
     * Returns the last element of the list
     * @return the last element, null if the list is empty
     */
    T last();
    /**
     * Returns the size of the list
     * @return the size of the list
     */
    int size();
    /**
     * Returns if the list is empty
     * @return true if the list is empty, false otherwise
     */
    boolean isEmpty();
    /**
     * Prints the list
     */
    void print();
}
