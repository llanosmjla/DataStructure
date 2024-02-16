package usfx.structures.linkedlists;

import usfx.structures.helpclasses.Person;
import usfx.structures.interfaces.IDoublyLinkedList;
import usfx.structures.interfaces.ILinkedList;
import usfx.structures.interfaces.IRunner;

import java.util.Scanner;

public class LinkedListRunner implements IRunner {
    @Override
    public void run() {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        while (option != 4) {
            subMenu();
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    ILinkedList<Integer> list = new LinkedList<>();
                    MenuItem menu = new MenuItem();
                    menu.run(list, null, 0);
                    break;
                case 2:
                    IDoublyLinkedList<Integer> list1 = new DoublyLinkedList<>();
                    MenuItem menu1 = new MenuItem();
                    menu1.run(null, list1, 1);
                    break;
                case 3:
                    ILinkedList<Integer> list2 = new CircularLinkedList<>();
                    MenuItem menu2 = new MenuItem();
                    menu2.run( list2, null,2);
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public void subMenu() {
        System.out.println("**************************************");
        System.out.println("********** Linked List Menu **********");
        System.out.println("1. LinkedList");
        System.out.println("2. DoublyLinkedList");
        System.out.println("3. CircularLinkedList");
        System.out.println("4. Exit");
    }


}
