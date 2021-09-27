package fibonachynumber;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        long[] mem = new long[n + 1];
        Arrays.fill(mem , -1);
        System.out.println(   " Memorisation  in recursion  =  " +fibNaiveFibonacci(n , mem));

         System.out.println("Effective  = " + fibEffective(n));


    }


    //naive and slow and obvious
    //O(2^n)
    private static long fibNaiveFibonacci(int n , long[] mem) {
        if (mem[n] != -1)
            return mem[n];

        if (n <= 1)
            return n;
        long result = fibNaiveFibonacci(n - 1 , mem) + fibNaiveFibonacci(n - 2 , mem);
         mem[n]= result;
         return result;
    }

     // Effective    O(n)
    private static long fibEffective(int n) {
        //O(n)
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;
        //  O(n)+O(n)=O(2n) =>O(n)
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr[n];
    }

}