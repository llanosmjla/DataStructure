package usfx.structures.linkedlists;

public class DoublyNodo<T> {
    T data;
    DoublyNodo<T> next;
    DoublyNodo<T> previous;

    public DoublyNodo(T data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
