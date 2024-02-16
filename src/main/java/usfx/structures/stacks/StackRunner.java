package usfx.structures.stacks;

import usfx.structures.interfaces.IRunner;
import usfx.structures.interfaces.IStack;

import java.util.Scanner;

public class StackRunner implements IRunner {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void run() {
        int option = 0;
        while (option != 3) {
            subMenu();
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    IStack<Integer> stack = new ArrayStack<>();
                    MenuItem menu = new MenuItem();
                    menu.run(stack);
                    break;
                case 2:
                    IStack<Integer> stack1 = new LinkedListStack<>();
                    MenuItem menu1 = new MenuItem();
                    menu1.run(stack1);
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public void subMenu() {
        System.out.println("**************************************");
        System.out.println("********** Stack Menu **********");
        System.out.println("1. Array Stack");
        System.out.println("2. Linked Stack");
        System.out.println("3. Exit");
    }

}
