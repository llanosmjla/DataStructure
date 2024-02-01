package usfx.structures.interfaces;
import usfx.structures.linkedlists.Nodo;

public interface IDequeue<T> {
    void addFirst(T data);
    void addLast(T data);
    Nodo<T> removeFirst();
    Nodo<T> removeLast();
    Nodo<T> first();
    Nodo<T> last();
    int size();
    boolean isEmpty();


}
