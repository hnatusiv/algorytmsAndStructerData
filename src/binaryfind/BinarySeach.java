package binaryfind;

import java.util.Arrays;

public class BinarySeach {
    public static void main(String[] args) {
        int[] array = {65 , 87 , 89 , 1 , -23 , 98 , 76 , 56 , 64 , 45 , 43 , 21 , -98 , 67};
        int k = 21;
        System.out.println(binatySeatch(array , k));
    }

    private static int binatySeatch(int[] array , int key) {
        Arrays.sort(array);
        System.out.println("A collection of sorted arrays  :  ");
        System.out.println(Arrays.toString(array));
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (array[middle] < key) {
                low = middle + 1;
            } else if (array[middle] > key) {
                high = middle - 1;
            } else {
             System.out.println("Index of  "   + key    +  " =    " + middle);
                System.out.println("  Length of array  is  "  +  (array.length));
               return middle;
            }

        }
        System.out.println(  "   Element   " +   key   +    "    is apcent    bekoce  ");
        return -1;

    }
}