package usfx.structures.linkedlists;

import usfx.structures.interfaces.IDoublyLinkedList;
import usfx.structures.interfaces.ILinkedList;

import java.util.Objects;
import java.util.Scanner;

public class MenuItem {
    public void run(ILinkedList<Integer> list, IDoublyLinkedList<Integer> list1, int option) {
        Scanner scanner = new Scanner(System.in);
        while (option != 9) {
            menuItem();
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("*** Add First ***");
                    System.out.print("Enter the item: ");
                    int item = scanner.nextInt();
                    if (list == null)
                        list1.addFirst(item);
                    else {
                        list.addFirst(item);
                    }
                    break;
                case 2:
                    System.out.println("*** Add Last ***");
                    System.out.print("Enter the item: ");
                    int item1 = scanner.nextInt();
                    if (list == null)
                        list1.addLast(item1);
                    else {
                        list.addLast(item1);
                    }
                    break;
                case 3:
                    System.out.println("*** Delete First ***");
                    if (list == null)
                        list1.removeFirst();
                    else {
                        list.removeFirst();
                    }
                    break;
                case 4:
                    System.out.println("*** Show First ***");
                    if (list == null){
                        System.out.println("First item: " + list1.first());
                    }else {
                        System.out.println("First item: " + list.first().data);
                    }
                    break;
                case 5:
                    System.out.println("*** Show Last ***");
                    if (list == null)
                        System.out.println("Last item: " + list1.last());
                    else {
                        System.out.println("Last item: " + list.last().data);
                    }
                    break;
                case 6:
                    System.out.println("*** Print ***");
                    if (list == null)
                        list1.print();
                    else {
                        list.print();
                    }
                    break;
                case 7:
                    System.out.println("*** Size ***");
                    if (list == null)
                        System.out.println("Size: " + list1.size());
                    else {
                        System.out.println("Size: " + list.size());
                    }
                    break;
                case 8:
                    System.out.println("*** Is Empty ***");
                    if (list == null)
                        System.out.println("Is empty: " + list1.isEmpty());
                    else {
                        System.out.println("Is empty: " + list.isEmpty());
                    }
                    break;
                case 9:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public void menuItem() {
        System.out.println("**************************************");
        System.out.println("*** List Menu ***");
        System.out.println("1. Add First");
        System.out.println("2. Add Last");
        System.out.println("3. Delete First");
        System.out.println("4. Show First");
        System.out.println("5. Show Last");
        System.out.println("6. Print");
        System.out.println("7. Size");
        System.out.println("8. Is Empty");
        System.out.println("9. Exit");
    }
}
