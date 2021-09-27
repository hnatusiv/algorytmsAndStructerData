package greedicealgoritms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SorteBuble {
    public static void main(String[] args) {
        int[] n = {3 , 1 , 7 , 9 , 9 , 5};
        sorteBubleRevers(n);
    }

    private static void sorteBubleRevers(int[] n) {
        int temp;
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {

                if (n[i] < n[j]) {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }

            }

        }

        System.out.println(Arrays.toString(n));
    }
}