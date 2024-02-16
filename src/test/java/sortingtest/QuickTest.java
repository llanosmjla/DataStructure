package sortingtest;

import org.junit.Test;
import usfx.structures.sorting.QuickSort;

import static org.junit.Assert.assertArrayEquals;

public class QuickTest {
    QuickSort quickTest = new QuickSort();

    @Test
    public void testQuickSort() {
        int[] arr = {5, 3, 2, 4, 1};
        int expected[] = {1, 2, 3, 4, 5};
        quickTest.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        assertArrayEquals(expected, arr);
    }
}
