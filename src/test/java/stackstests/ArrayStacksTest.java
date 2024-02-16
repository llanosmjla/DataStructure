package stackstests;

import org.junit.Test;
import usfx.structures.interfaces.ILinkedList;
import usfx.structures.interfaces.IStack;
import usfx.structures.stacks.ArrayStack;

public class ArrayStacksTest {

    IStack<Integer> stack = new ArrayStack<>();

    //Test 1: size of the stack
    @Test
    public void size() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assert(stack.size() == 3);
    }

    //Test 2: Verify if the stack is empty
    @Test
    public void isEmpty() {
        assert(stack.isEmpty());
    }

    //Test 3: Verify if push is working
    @Test
    public void push() {
        stack.push(1);
        assert(stack.size() == 1);
    }

    //Test 4: Verify if pop is working
    @Test
    public void pop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int expected = 3;
        int current = stack.pop();
        assert(expected == current);
    }

    //Test 5: Verify top element
    @Test
    public void top() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int expected = 3;
        int current = stack.top();
        assert(expected == current);
    }

}
