package usfx.structures.sorting;

import usfx.structures.interfaces.IRunner;

public class BubbleRunner implements IRunner {

    @Override
    public void run() {
        BubbleSort bs = new BubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90,1, 200, 5, 6, 8, 24, 4,23, 201, 222, 223, 333, 15, 16, 17, 18};
        bs.bubbleSortRecursive(arr, arr.length);
        System.out.println("Sorted array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
