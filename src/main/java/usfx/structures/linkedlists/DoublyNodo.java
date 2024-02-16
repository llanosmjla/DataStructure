package usfx.structures.linkedlists;

public class DoublyNodo<T> {
    public T data;
    public DoublyNodo<T> next;
    public DoublyNodo<T> previous;

    public DoublyNodo(T data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
