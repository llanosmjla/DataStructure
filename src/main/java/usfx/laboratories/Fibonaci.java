package usfx.laboratories;

public class Fibonaci {

    public static void main(String[] args) {
        int n = 6;

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecur(i) + " ");
        }
    }


    public static int fibonacciRecur(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciRecur(n - 1) + fibonacciRecur(n - 2);

    }
    public static int[] Fibonacci(int n){
        if(n <= 1){
            int[] aswer = {n, 0};
            return aswer;
        }
        int[] temp = Fibonacci(n - 1);
        int[] aswer = {temp[0] + temp[1], temp[0]};
        return aswer;
    }
}




