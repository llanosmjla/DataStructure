package usfx.structures.queues;

import usfx.structures.interfaces.IDequeue;
import usfx.structures.interfaces.IQueue;

import java.util.Scanner;

public class MenuItem {

    public void run(IQueue<Integer> queue) {

        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option != 6) {
            itemMenuQueue();
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("*** Enqueue ***");
                    System.out.print("Enter the item: ");
                    int item = scanner.nextInt();
                    queue.enqueue(item);
                    break;
                case 2:
                    System.out.println("*** Dequeue ***");
                    System.out.println("Item removed: " + queue.dequeue());
                    queue.dequeue();
                    break;
                case 3:
                    System.out.println("*** First ***");
                    var first = queue.first();
                    System.out.println("First item: " + first);
                    break;
                case 4:
                    System.out.println("*** Size ***");
                    queue.size();
                    System.out.println("Size: " + queue.size());
                    break;
                case 5:
                    System.out.println("*** Print ***");
                    queue.print();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public void run2(IDequeue<Integer> dequeue){
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option != 9) {
            itemMenuDequeue();
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("*** Add First ***");
                    System.out.print("Enter the item: ");
                    int item = scanner.nextInt();
                    dequeue.addFirst(item);
                    break;
                case 2:
                    System.out.println("*** Add Last ***");
                    System.out.print("Enter the item: ");
                    int item1 = scanner.nextInt();
                    dequeue.addLast(item1);
                    break;
                case 3:
                    System.out.println("*** Remove First ***");
                    System.out.println("Item removed: " + dequeue.removeFirst());
                    dequeue.removeFirst();
                    break;
                case 4:
                    System.out.println("*** Remove Last ***");
                    System.out.println("Item removed: " + dequeue.removeLast());
                    dequeue.removeLast();
                    break;
                case 5:
                    System.out.println("*** First ***");
                    var first = dequeue.first();
                    System.out.println("First item: " + first);
                    break;
                case 6:
                    System.out.println("*** Last ***");
                    var last = dequeue.last();
                    System.out.println("Last item: " + last);
                    break;
                case 7:
                    System.out.println("*** Size ***");
                    dequeue.size();
                    System.out.println("Size: " + dequeue.size());
                    break;
                case 8:
                    System.out.println("*** Print ***");
                    dequeue.print();
                    break;
                case 9:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

    }

    public void itemMenuQueue() {
        System.out.println("**************************************");
        System.out.println("********** Queue Menu **********");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. First");
        System.out.println("4. Size");
        System.out.println("5. Print");
        System.out.println("6. Exit");
    }

    public void itemMenuDequeue() {
        System.out.println("**************************************");
        System.out.println("********** Dequeue Menu **********");
        System.out.println("1. Add First");
        System.out.println("2. Add Last");
        System.out.println("3. Remove First");
        System.out.println("4. Remove Last");
        System.out.println("5. First");
        System.out.println("6. Last");
        System.out.println("7. Size");
        System.out.println("8. Print");
        System.out.println("9. Exit");
    }


}
