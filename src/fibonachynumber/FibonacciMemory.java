package fibonachynumber;

public class FibonacciMemory {
    public static void main(String[] args) {
        int n = 10;
      // long fibNaive = fibNaive(n);
        //System.out.println("Number fibNaive of " + n+ " =  "+ fibNaive);
        long fibEffective = fibEffective(n);
        System.out.println("Number fibEffective of " + n+ " =  "+ fibEffective);
    }
    //effective method O(n)
    private static long fibEffective(int n) {
       long[] arr = new  long[n+1];
       arr[0]=0;
       arr[1]=1;
        for (int i = 2; i <arr.length ; i++) {
            arr[i]= arr[i-2]+arr[i-1];
        }
        return arr[n];
    }
    // naive method O(n^2)
    private static long fibNaive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibNaive(n - 2) + fibNaive(n - 1);

        }
    }


}