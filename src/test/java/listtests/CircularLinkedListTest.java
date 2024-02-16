package listtests;

import org.junit.Test;
import usfx.structures.interfaces.ILinkedList;
import usfx.structures.linkedlists.CircularLinkedList;
import usfx.structures.linkedlists.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CircularLinkedListTest {

    ILinkedList<Integer> circularList = new CircularLinkedList<>();

    //Test 1: add first element
    @Test
    public void addFirst() {
        circularList.addFirst(1);
        assertTrue(circularList.size() == 1);
    }

    //Test 2: add last element
    @Test
    public void addLast() {
        circularList.addLast(2);
        circularList.addLast(3);
        assertTrue(circularList.size() == 2);
    }

    //Test 3: size of the circular list
    @Test
    public void size() {
        circularList.addFirst(1);
        circularList.addLast(2);
        circularList.addLast(3);
        assertTrue(circularList.size() == 3);
    }

    //Test 4: Verify if the list is empty
    @Test
    public void isEmpty() {
        assertTrue(circularList.isEmpty());
    }

    //Test 5: Verify if not empty
    @Test
    public void isNotEmpty() {
        circularList.addFirst(1);
        assertFalse(circularList.isEmpty());
    }

    //Test 6: Verify first element
    @Test
    public void first() {
        circularList.addFirst(1);
        circularList.addLast(2);
        circularList.addLast(3);
        int expected = 1;
        int current = circularList.first().data;
        assertTrue(expected == current);
    }

    //Test 7: Verify last element
    @Test
    public void last() {
        circularList.addFirst(1);
        circularList.addLast(2);
        circularList.addLast(3);
        int expected = 3;
        int current = circularList.last().data;
        assertTrue(expected == current);
    }

    //Test 8: Remove first element
    @Test
    public void removeFirst() {
        circularList.addFirst(1);
        circularList.addLast(2);
        circularList.addLast(3);
        circularList.removeFirst();
        int expected = 2;
        int current = circularList.first().data;
        assertTrue(expected == current);
    }
}
