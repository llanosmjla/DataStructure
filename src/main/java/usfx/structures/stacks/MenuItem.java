package usfx.structures.stacks;

import usfx.structures.interfaces.IRunner;
import usfx.structures.interfaces.IStack;

import java.util.Scanner;

public class MenuItem {
    public void run(IStack<Integer> stack) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option != 6) {
            itemMenu();
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("*** Push ***");
                    System.out.print("Enter the item: ");
                    int item = scanner.nextInt();
                    stack.push(item);
                    break;
                case 2:
                    System.out.println("*** Pop ***");
                    System.out.println("Item removed: " + stack.pop());
                    stack.pop();
                    break;
                case 3:
                    System.out.println("*** Top ***");
                    var top = stack.top();
                    System.out.println("Top item: " + top);
                    break;
                case 4:
                    System.out.println("*** Size ***");
                    stack.size();
                    System.out.println("Size: " + stack.size());
                    break;
                case 5:
                    System.out.println("*** Print ***");
                    stack.print();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

    }

    public void itemMenu() {
        System.out.println("**************************************");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Top");
        System.out.println("4. Size");
        System.out.println("5. Print");
        System.out.println("6. Exit");
    }
}
