package greedicealgoritms;

import java.util.Arrays;
import java.util.Collections;

public class GreedyAlgorithms {
    public static void main(String[] args) {
        int[] digits = {6 , 8 , 3 , 5 , 1 , 9 , 7 , 9 , 4 , 8};

        System.out.println("  SortOf Buble  " + maxNumberFromDigitsOfSortBuble(digits));
        System.out.println("maxNumberFromDigits  " + maxNumberFromDigits(digits));

    }



    private static String maxNumberFromDigits(int[] digits) {
        Arrays.sort(digits);
        String result = "";
        for (int i = digits.length - 1; i >= 0; i--)
            result += digits[i];
        return result;
    }

    private static String maxNumberFromDigitsOfSortBuble(int[] digits) {
        int temp;
        for (int i = 0; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] < digits[j]) {
                    temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }
        String result = "";
        for (int i = 0; i < digits.length; i++)
            result += digits[i];
        return result;
    }
}
