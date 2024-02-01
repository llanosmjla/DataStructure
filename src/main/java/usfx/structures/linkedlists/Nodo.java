package usfx.structures.linkedlists;

public class Nodo<T> {
    public T data;
    Nodo<T> next;

    public Nodo(T data){
        this.data = data;
        this.next = null;
    }
}
