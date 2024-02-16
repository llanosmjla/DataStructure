package usfx.structures.linkedlists;

import usfx.structures.interfaces.IDoublyLinkedList;

public class DoublyLinkedList<T> implements IDoublyLinkedList<T> {

    DoublyNodo<T> head;
    DoublyNodo<T> tail;
    @Override
    public int size() {
        if (isEmpty()){
            return 0;
        }
        int size = 0;
        DoublyNodo<T> current = head;
        while (current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public DoublyNodo<T> first() {
        return head;
    }

    @Override
    public DoublyNodo<T> last() {
        if (isEmpty()){
            System.out.println("List is empty");
            return null;
        }
        DoublyNodo<T> current = head;
        while (current.next != null){
            current = current.next;
        }
        return current;
    }

    @Override
    public void addFirst(T data) {
        DoublyNodo<T> newNode = new DoublyNodo<T>(data);
        if (isEmpty()){
            head = newNode;
            return;
        }
        //head->1->null
        // head->2<->1->null
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
        System.out.println("head: " + head.data);
        System.out.println("head.next: " + head.next.data);
        System.out.println("head.next.previous: " + head.next.previous.data);
    }

    @Override
    public void addLast(T data) {
        if (isEmpty()){
            addFirst(data);
            return;
        }
        DoublyNodo<T> lastNode = last();
        if (lastNode == null){
            System.out.println("List is empty");
            return;
        }
        DoublyNodo<T> newNode = new DoublyNodo<T>(data);
        lastNode.next = newNode;
        newNode.previous = lastNode;
        System.out.println("lastNode: " + lastNode.data);
        System.out.println("lastNode.next: " + lastNode.next.data);
        System.out.println("lastNode.next.previous: " + lastNode.next.previous.data);

    }
    @Override
    public void removeFirst() {
        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        head.previous = null;
    }
    @Override
    public void removeLast() {
        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }
        DoublyNodo<T> current = head;
        //1<->2->null
        while (current.next != null){
            current = current.next;
        }
        current.previous.next = null;
    }

    @Override
    public DoublyNodo<T> find(T data) {
        if (isEmpty()){
            System.out.println("List is empty");
            return null;
        }
        DoublyNodo<T> current = head;
        while (current != null){
            if (current.data.equals(data)){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public void addAfter(DoublyNodo<T> node, T data) {
        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }
        DoublyNodo<T> nodeFound = find(node.data);
        if (nodeFound == null){
            System.out.println("Node not found");
            return;
        }
        DoublyNodo<T> newNode = new DoublyNodo<T>(data);
        T temp = nodeFound.next.data;
        System.out.println("_______________________");
        System.out.println("temp: " + temp);
        newNode.next = nodeFound.next;
        nodeFound.previous = newNode;

        nodeFound.next = newNode;
        newNode.previous = nodeFound;
    }

    @Override
    public void print() {
        DoublyNodo<T> current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
