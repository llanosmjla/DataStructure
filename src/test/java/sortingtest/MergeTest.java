package sortingtest;

import org.junit.Test;
import usfx.structures.sorting.MergeSort;

import static org.junit.Assert.assertArrayEquals;

public class MergeTest {
    MergeSort mergeTest = new MergeSort();

    @Test
    public void testMergeSort() {
        int[] arr = {5, 3, 2, 4, 1};
        int expected[] = {1, 2, 3, 4, 5};
        mergeTest.mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        assertArrayEquals(expected, arr);
    }
}
