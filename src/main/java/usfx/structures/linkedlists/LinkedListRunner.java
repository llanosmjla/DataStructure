package usfx.structures.linkedlists;

import usfx.structures.helpclasses.Person;
import usfx.structures.interfaces.IRunner;

public class LinkedListRunner implements IRunner {
    @Override
    public void run() {
        LinkedList<Person> list = new LinkedList<>();
        list.addFirst(new Person("John", 20));
        list.addLast(new Person("Jane", 30));
        System.out.println("Size: " + list.size());
        list.print();
    }


}
