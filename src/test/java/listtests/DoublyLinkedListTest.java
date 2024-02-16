package listtests;

import org.junit.Test;
import usfx.structures.interfaces.IDoublyLinkedList;
import usfx.structures.interfaces.ILinkedList;
import usfx.structures.linkedlists.DoublyLinkedList;

import static org.junit.Assert.assertTrue;

public class DoublyLinkedListTest {
    IDoublyLinkedList<Integer> doublyList = new DoublyLinkedList<>();

    //Test 1: size of the doublyList
    @Test
    public void size() {
        doublyList.addFirst(1);
        doublyList.addLast(2);
        doublyList.addLast(3);
        assertTrue(doublyList.size() == 3);
    }

    //Test 2: Verify if the list is empty
    @Test
    public void isEmpty() {
        assertTrue(doublyList.isEmpty());
    }

    //Test 3: Verify first element
    @Test
    public void first() {
        doublyList.addFirst(1);
        doublyList.addLast(2);
        doublyList.addLast(3);
        int expected = 1;
        int current = doublyList.first().data;
        assertTrue(expected == current);
    }

    //Test 4: Verify last element
    @Test
    public void last() {
        doublyList.addFirst(1);
        doublyList.addLast(2);
        doublyList.addLast(3);
        int expected = 3;
        int current = doublyList.last().data;
        assertTrue(expected == current);
    }

//Test 5: add first element
    @Test
    public void addFirst() {
        doublyList.addFirst(1);
        assertTrue(doublyList.size() == 1);
    }

    //Test 6: add last element
    @Test
    public void addLast() {
        doublyList.addLast(2);
        doublyList.addLast(3);
        assertTrue(doublyList.size() == 2);
    }

    //Test 7: Verify if not empty
    @Test
    public void isNotEmpty() {
        doublyList.addFirst(1);
        assertTrue(!doublyList.isEmpty());
    }

    //Test 8: remove first element
    @Test
    public void removeFirst() {
        doublyList.addFirst(1);
        doublyList.addLast(2);
        doublyList.removeFirst();
        assertTrue(doublyList.size() == 1);
    }

    //Test 9: remove last element
    @Test
    public void removeLast() {
        doublyList.addFirst(1);
        doublyList.addLast(2);
        doublyList.removeLast();
        assertTrue(doublyList.size() == 1);
    }

    //Test 10: find element
    @Test
    public void find() {
        doublyList.addFirst(1);
        doublyList.addLast(2);
        doublyList.addLast(3);
        assertTrue(doublyList.find(2).data == 2);
    }

}
