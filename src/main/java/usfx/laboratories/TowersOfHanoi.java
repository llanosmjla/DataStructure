package usfx.laboratories;

import usfx.structures.stacks.LinkedListStack;

import java.util.ArrayList;

public class TowersOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        LinkedListStack<String> stackA = new LinkedListStack<>();
        LinkedListStack<String> stackB = new LinkedListStack<>();
        LinkedListStack<String> stackC = new LinkedListStack<>();
        for(int i = n; i > 0; i--){
            stackA.push("A"+i);
        }

        System.out.println("Initial configuration");
        printTowers(stackA, stackB, stackC);
        hanoi(n, stackA, stackB, stackC);
        System.out.println("Final configuration");
        printTowers(stackA, stackB, stackC);



    }

    public static void hanoi(int n, LinkedListStack<String> stackA, LinkedListStack<String> stackB, LinkedListStack<String> stackC) {
        if (n > 0) {
            hanoi(n - 1, stackA, stackC, stackB);
            var disk = stackA.pop();
            stackB.push(disk.data);
            System.out.println("Move disk " + disk.data + " from " + stackA + " to " + stackB);
            printTowers(stackA, stackB, stackC);
            hanoi(n - 1, stackC, stackB, stackA);
        }
    }
    /*public static void hanoi(int n, LinkedListStack<String> stackA, LinkedListStack<String> stackB, LinkedListStack<String> stackC) {
        if(n==1){
            var disk = stackA.pop();
            stackC.push(disk.data);
            System.out.println("Move disk " + disk.data + " from " + stackA + " to " + stackC);
            return;
        }
        hanoi(n-1, stackA, stackC, stackB);
        var disk = stackA.pop();
        stackC.push(disk.data);
        System.out.println("Move disk " + disk.data + " from " + stackA + " to " + stackC);
        hanoi(n-1, stackB, stackA, stackC);
    }*/


    public static void printTowers(LinkedListStack<String> stackA, LinkedListStack<String> stackB, LinkedListStack<String> stackC) {
        System.out.println("__________________________________________________");
        System.out.println("Rod A: " + stackA);
        stackA.print();
        System.out.println("Rod B: " + stackB);
        stackB.print();
        System.out.println("Rod C: " + stackC);
        stackC.print();
        System.out.println("__________________________________________________");
    }

}
