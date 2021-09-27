package fibonachynumber;

public class FibonacciMemory2 {
    public static void main(String[] args) {
        int n = 10;
        long fibonNaive = fibonNaive(n);
        long fibonEffective = fibonEffective(n);
        System.out.println("fibonNaive  of  "+ n + " = " + fibonNaive);
        System.out.println("fibonEffective  of  "+ n + " = " + fibonEffective);

    }

    private static long fibonEffective(int n) {
        int[] arr = new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i< arr.length; i++) {
         arr[i]  = arr[i-2]+arr[i-1];
        }
         return arr[n];
    }

    private static long fibonNaive(int n) {

        if (n <= 1) {
            return n;
        } else
            return fibonNaive(n - 2) + fibonNaive(n - 1);

    }
}