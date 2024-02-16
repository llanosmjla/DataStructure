package usfx.structures.linkedlists;

import usfx.structures.interfaces.ILinkedList;

public class LinkedList<T> implements ILinkedList<T> {
    Nodo<T> head;
    @Override
    public int size(){
        if(isEmpty()){
            return 0;
        }
        int size = 0;
        Nodo<T> current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        return size;
    }
    @Override
    public boolean isEmpty(){
        return head == null;
    }
    @Override
    public Nodo<T> first(){
        return head;
    }
    @Override
    public Nodo<T> last(){
        if(isEmpty()){
            System.out.println("List is empty");
            return null;
        }
        Nodo<T> current = head;
        while(current.next != null){
            current = current.next;
        }
        return current;
    }
    @Override
    public void addFirst(T data){
        Nodo<T> newNode = new Nodo<T>(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    @Override
    public void addLast(T data){
        if (isEmpty()){
            head = new Nodo<T>(data);
            return;
        }
        Nodo<T> current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Nodo<T>(data);

    }
    @Override
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    /**
     * Remove the last element of the list
     */
    public void removeLast(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        //1->2->3->4->5
        //1->2->3->null
        Nodo<T> current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    @Override
    public void print(){
        Nodo<T> current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Nodo<T> current = head;
        while (current != null){
            sb.append(current.data);
            sb.append(" ");
            current = current.next;
        }
        return sb.toString();
    }

}
