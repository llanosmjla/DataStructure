package usfx.structures.interfaces;
import usfx.structures.linkedlists.Nodo;

public interface ILinkedList<T> {
    int size();
    boolean isEmpty();
    Nodo<T> first();
    Nodo<T> last();
    void addFirst(T data);
    void addLast(T data);
    void removeFirst();
    void print();
}
