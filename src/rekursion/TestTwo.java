package rekursion;

public class TestTwo {
    public static void main(String[] args) {
        int n= 5;
    counter(n);
       counterN(n);

     System.out.println(  "Factorial  of number  " + n + " =  "  +fact(n));
    }

    private static void counterN(int n) {
        System.out.println( "Counter  N ="+ n);
        if (n<2 )
            return ;
        counter(n-1);

    }

    private static long fact(int n){
        if (n==1)
            return n;
      return   n*fact(n-1);

    }

    private static void counter(int n) {
        if (n==0)
            return ;
        System.out.println(n);

        counter(n-1);
    }


    }
