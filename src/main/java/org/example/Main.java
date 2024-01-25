package org.example;

public class Main {
    public static void main(String[] args) {
        printMenu();

        IManager manager = ManagerFactory.getManager(1);
        manager.printMenu();
        manager.run();
    }

    public static void printMenu() {
        System.out.println("Welcome to the Data Structure Manager");
        System.out.println("1. LinkedList");
        System.out.println("2. Stack");
        System.out.println("3. Queue");
        System.out.println("4. Trees");
        System.out.println("5. Graphs");
        System.out.println("6. 1. Sorting");
        System.out.println("7. 2. Sorting");
        System.out.println("8. 3. Sorting");
    }
}