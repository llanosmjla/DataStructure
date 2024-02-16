package stackstests;

import org.junit.Test;
import usfx.structures.interfaces.IStack;
import usfx.structures.stacks.LinkedListStack;

import static org.junit.Assert.assertTrue;

public class LinkedListStackTest {

    IStack<Integer> stack = new LinkedListStack<>();

    //Test 1: size of the stack
    @Test
    public void size() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertTrue(stack.size() == 3);
    }

    //Test 2: pop from the stack
    @Test
    public void pop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertTrue(stack.pop() == 3);
    }

    //Test 3: top of the stack
    @Test
    public void top() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertTrue(stack.top() == 3);
    }

    //Test 4: isEmpty of the stack
    @Test
    public void isEmpty() {
        assertTrue(stack.isEmpty());
    }

//Test 5: Verify if push is working
    @Test
    public void push() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertTrue(stack.size() == 3);
    }
}
