package rekursion;

public class Test {
    public static void main(String[] args) {
        int n = 4;
       int[] array= {1,2,3,4,5};

       //  counter(n);
        findFact(n);
       System.out.println(" Fact  of  " + n + "  = " + findFact(n));
    }

    //fact(4)
    //4*fact(3)= 3 *  6=return 24
    //3*fact(2)= 3 * 2 =return 6
    //2*fact(1)=2 * 1 = return 2
    //fact(1)= 1 * 1 = return 1
    private static long findFact(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * findFact(n - 1);
    }



    private static void counter(int n) {
        if (n == 0)
            return;
        System.out.println("Counter  =  " + n);
        counter(n - 1);
    }
}
