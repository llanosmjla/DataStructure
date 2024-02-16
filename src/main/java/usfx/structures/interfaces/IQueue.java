package usfx.structures.interfaces;
import usfx.structures.linkedlists.Nodo;


public interface IQueue<T> {
    /***
     * Enqueue an element
     * @param data Add to the end of the queue
     */
    void enqueue(T data);
    /***
     * Dequeue an element from the queue
     * Remove and return the first element in the queue(or null if empty)
     */
    T dequeue();
    /***
     * first element in the queue
     * Return the first element in the queue, without removing it (or null if empty)
     */
    T first();
    /***
     * Is the queue empty?
     * @return true if the queue is empty, and false otherwise
     */
    boolean isEmpty();
    /***
     * size of the queue
     * @return the number of elements in the queue
     */
    int size();
    /***
     * Print the queue
     */
    void print();
}
