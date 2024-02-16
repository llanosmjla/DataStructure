package usfx.structures.queues;

import usfx.structures.interfaces.IDequeue;
import usfx.structures.interfaces.IQueue;
import usfx.structures.interfaces.IRunner;

import java.util.Scanner;

public class QueueRunner implements IRunner {


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
                    IQueue<Integer> queue = new ArrayQueue<>();
                    MenuItem menu = new MenuItem();
                    menu.run(queue);
                    break;
                case 2:
                    IQueue<Integer> queue1 = new LinkedListQueue<>();
                    MenuItem menu1 = new MenuItem();
                    menu1.run(queue1);
                    break;
                case 3:
                    IDequeue<Integer> queue2 = new Dequeue<>();
                    MenuItem menu2 = new MenuItem();
                    menu2.run2(queue2);
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
        System.out.println("********** Queue Menu **********");
        System.out.println("1. Array Queue");
        System.out.println("2. Linked Queue");
        System.out.println("3. Dequeue");
        System.out.println("4. Exit");
    }

}
