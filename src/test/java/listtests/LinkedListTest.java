package listtests;

import org.junit.Test;
import usfx.structures.linkedlists.LinkedList;

import static org.junit.Assert.assertTrue;

public class LinkedListTest {
    @Test
    public void IsEmptyTest(){
        LinkedList<Integer> list = new LinkedList<>();

        assertTrue(list.isEmpty());
    }
    @Test
    public void AddFirstTest(){
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        assertTrue(list.size() == 3);
    }
    @Test
    public void AddLastTest(){
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        assertTrue(list.size() == 3);
    }

}
