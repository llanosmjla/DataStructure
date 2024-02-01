package usfx.structures.interfaces;
import usfx.structures.linkedlists.Nodo;


public interface IQueue<T> {
    /***
     * Enqueue an element
     * @return the element enqueued
     */
    void enqueue(T data);
    /***
     * Dequeue an element from the queue
     * @return the first element in the queue
     */
    T dequeue();
    /***
     * first element in the queue
     * @return the first element in the queue
     */
    T first();
    /***
     * Is the queue empty?
     * @return true if the queue is empty, false if not
     */
    boolean isEmpty();
    /***
     * size of the queue
     * @return the number of elements in the queue
     */
    int size();
}
