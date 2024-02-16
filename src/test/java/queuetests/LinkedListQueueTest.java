package queuetests;

import org.junit.Test;
import usfx.structures.interfaces.IQueue;
import usfx.structures.queues.LinkedListQueue;

import static org.junit.Assert.assertTrue;

public class LinkedListQueueTest {

    IQueue<Integer> queue = new LinkedListQueue<>();

    //Test 1: size of the queue
    @Test
    public void size() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertTrue(queue.size() == 3);
    }

    //Test 2: Verify if the queue is empty
    @Test
    public void isEmpty() {
        assertTrue(queue.isEmpty());
    }

    //Test 3: Verify if enqueue is working
    @Test
    public void enqueue() {
        queue.enqueue(1);
        assertTrue(queue.size() == 1);
    }

    //Test 4: Verify if dequeue is working
    @Test
    public void dequeue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        int expected = 1;
        int current = queue.dequeue();
        assertTrue(expected == current);
    }

    //Test 5: Verify first element
    @Test
    public void first() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        int expected = 1;
        int current = queue.first();
        assertTrue(expected == current);
    }

}
