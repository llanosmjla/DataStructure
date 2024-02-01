package usfx.structures.interfaces;
import usfx.structures.linkedlists.DoublyNodo;

public interface IDoublyLinkedList<T> {
    int size();
    boolean isEmpty();
    DoublyNodo<T> first();
    DoublyNodo<T> last();
    void addFirst(T data);
    void addLast(T data);
    void print();
}
