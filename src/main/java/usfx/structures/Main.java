package usfx.structures;

import usfx.structures.interfaces.IRunner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //menu();
        String option;
        do {
            menu();
            System.out.print("Enter your option: ");
            option = scanner.nextLine();
            if (option.equals("A")) {
                IRunner runner = RunnerFactory.getIRunner(option);
                runner.run();
                break;
            }
            if (option.equals("B")) {
                IRunner runner = RunnerFactory.getIRunner(option);
                runner.run();
                break;
            }
            if (option.equals("C")) {
                IRunner runner = RunnerFactory.getIRunner(option);
                runner.run();
                break;
            }
            if (option.equals("E")) {
                IRunner runner = RunnerFactory.getIRunner(option);
                runner.run();
                break;
            }
        } while (!option.equals("Q"));
    }

    public static void menu(){
        System.out.println("Welcome to the menu of data structures");
        System.out.println("A. LinkedList");
        System.out.println("B. DoublyLinkedList");
        System.out.println("C. CircularLinkedList");
        System.out.println("E. Stack");

    }
}
