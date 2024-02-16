package usfx.structures.sorting;

public class BubbleSort {
    public void bubbleSortRecursive(int[] arr, int n){
        if(n == 1){
            return;
        }
        //---------n=4----------------
        //      0 -  1  - 2  - 3
        //      4 -> 3 -> 2 -> 1
        //i0    3 -> 4 -> 2 -> 1
        //i1    3 -> 2 -> 4 -> 1
        //i2    3 -> 2 -> 1 -> 4
        //------------n=3---------------
        //      0 -  1  - 2
        //      3 -> 2 -> 1
        //i0    2 -> 3 -> 1
        //i1    2 -> 1 -> 3
        //------------n=2---------------
        //      0 -  1
        //      2 -> 1
        //i0    1 -> 2
        //------------n=1---------------
        //      1 -> 2 -> 3 -> 4
        //      return
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                swap(arr, i, i + 1);//1, 2, 3, 4 ...
            }
        }
        bubbleSortRecursive(arr, n - 1);//n = 4, 3, 2, 1
    }
    private void swap(int[] arr, int i, int j){
        //      0 -  1  - 2  - 3
        //      4 -> 3 -> 2 -> 1
        // i0, i1
        int temp = arr[i]; // 4     -- 4        -- 4
        arr[i] = arr[j]; // 3 3 2 1 -- 3 2 2 1  -- 3 2 1 1
        arr[j] = temp;// 3 4 2 1    -- 3 2 4 1  -- 3 2 1 4
    }

    /*public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90,1, 200, 5, 6, 8, 24, 4,23, 201, 222, 223, 333, 15, 16, 17, 18};
        bs.bubbleSortRecursive(arr, arr.length);
        System.out.println("Sorted array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }*/

}
