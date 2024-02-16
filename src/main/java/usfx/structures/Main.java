package usfx.structures;

import usfx.structures.interfaces.IRunner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //menu();
        String option = " ";
        while (!option.equals("S")) {
            menu();
            System.out.print("Enter your option: ");
            option = scanner.nextLine().toUpperCase();
            switch (option) {
                case "A", "B", "C", "E", "F", "G", "H":
                    IRunner runner = RunnerFactory.getIRunner(option);
                    runner.run();
                    break;
                case "S":
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("Welcome to the menu of data structures");
        System.out.println("A. List");
        System.out.println("E. Stack");
        System.out.println("F. Queue");
        System.out.println("G. Tree");
        System.out.println("H. Graph");
        System.out.println("S. Exit");
    }


}
