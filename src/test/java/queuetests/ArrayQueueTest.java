package queuetests;

import org.junit.Test;
import usfx.structures.interfaces.IQueue;
import usfx.structures.queues.ArrayQueue;
import org.junit.jupiter.api.Assertions;

public class ArrayQueueTest {
    IQueue<Integer> queue = new ArrayQueue<>();

    /**
     * Test for size
     */
    @Test
    public void onInitQueueSizeShouldBeZero() {
        Assertions.assertEquals(0, queue.size());
    }

    /**
     * Test for enqueue
     */
    @Test
    public void onEnqueueQueueSizeShouldBeOne() {
        queue.enqueue(1);
        assert queue.size() == 1;
    }
    /**
     * Test for dequeue
     */
    @Test
    public void onDequeueQueueSizeShouldBeZero() {
        queue.enqueue(1);
        queue.dequeue();
        assert queue.size() == 0;
    }
    /**
     * Test for first element in the queue
     */
    @Test
    public void onFirstQueueShouldReturnFirstElement() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assert queue.first() == 1;
    }
    /**
     * Test for isEmpty
     */
    @Test
    public void onEmptyQueueIsEmptyShouldReturnTrue() {
        Assertions.assertTrue(queue.isEmpty());
    }


}
