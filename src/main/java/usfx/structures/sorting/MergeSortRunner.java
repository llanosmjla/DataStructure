package usfx.structures.sorting;

import usfx.structures.interfaces.IRunner;

public class MergeSortRunner implements IRunner {

        public void run() {
            MergeSort mergeSort = new MergeSort();
            int[] array = {5, 3, 8, 6, 2, 7, 1, 4};
            mergeSort.mergeSort(array);
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
}
