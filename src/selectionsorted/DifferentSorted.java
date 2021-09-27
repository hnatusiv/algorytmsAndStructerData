package selectionsorted;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static java.util.Arrays.sort;

public class DifferentSorted {

    public static void main(String[] args) {
        int[] array = {-7 , 9 , 6 , 0 , -11 , 7 , -5};
        selectSort(array);// сортировка выбором
        bubbleSort(array);// сортировка пузырьком
        insertionSort(array);// сортировка вставками
        javaLibrarySorted(array);   // сортировка  java library
        int[] arr = quickSorted(array , 0 , 6);//сортировка разделения  вокруг стержня
        System.out.println("Sort the array in partition Pivot Sorted( quick Sorted) way  have  look : " + Arrays.toString(arr));

    }


    static int partitionPivotSorted(int[] array , int begin , int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }

        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    private static int[] quickSorted(int[] array , int begin , int end) {
        if (end <= begin)
            return array;
        int pivot = partitionPivotSorted(array , begin , end);
        quickSorted(array , begin , pivot - 1);
        quickSorted(array , pivot + 1 , end);

        return array;
    }


    // сортировка вставками
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {


        }

    }

    private static void javaLibrarySorted(int[] array) {
        //  Arrays.sort(array);
        System.out.println("Sort the array in a java library sorted way  have  look : " + Arrays.toString(array));


    }

    // сортировка пузырьком
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }

        System.out.println(" Sort the array in a BUBBLE way  have  look :   " + Arrays.toString(array));
    }

    // сортировка выбором
    private static void selectSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minValueOfArray = array[i];
            int indexOfMinValueOfArray = i;
            for (int j = i + 1; j < array.length; j++) {
                if (minValueOfArray > array[j]) {
                    minValueOfArray = array[j];
                    indexOfMinValueOfArray = j;
                }

            }
            int temp = array[i];
            array[i] = array[indexOfMinValueOfArray];
            array[indexOfMinValueOfArray] = temp;
        }

        System.out.println(" Sort the array in a SELECT way  have  look :   " + Arrays.toString(array));
    }

}
