package usfx.structures.stacks;

import usfx.structures.interfaces.IRunner;

public class StackRunner implements IRunner {
    @Override
    public void run() {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        var top = stack.top();
        System.out.println("Top: " + top.data.toString());


    }
}
