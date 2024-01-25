package org.example;

public class LlinkedListManager implements IManager{
    public void run() {
        System.out.println("I am running LlinkedListManager");
    }

    @Override
    public void printMenu() {
        System.out.println("Menu for LlinkedListManager");
        System.out.println("1. Add");
        System.out.println("2. Show");
        System.out.println("3. Update");
        System.out.println("4. Delete");
    }
}
