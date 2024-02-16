package sortingtest;

import org.junit.Test;
import usfx.structures.sorting.BubbleSort;

import static org.junit.Assert.assertArrayEquals;

public class BubbleTest {
    BubbleSort bs = new BubbleSort();

    @Test
    public void testBubbleSort() {
        int[] arr = {5, 3, 2, 4, 1};
        int expected[] = {1, 2, 3, 4, 5};
        bs.bubbleSortRecursive(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        assertArrayEquals(expected, arr);
    }
}
