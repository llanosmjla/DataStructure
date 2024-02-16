package usfx.structures.interfaces;
import usfx.structures.linkedlists.DoublyNodo;

public interface IDoublyLinkedList<T> {
    int size();
    boolean isEmpty();
    DoublyNodo<T> first();
    DoublyNodo<T> last();
    void addFirst(T data);
    void addLast(T data);
    void removeFirst();
    void removeLast();
    DoublyNodo<T> find(T data);
    void addAfter(DoublyNodo<T> node, T data);

    void print();
}
