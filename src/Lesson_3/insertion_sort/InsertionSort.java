package Lesson_3.insertion_sort;

import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {

        int[] array = {1, 7, 15, 3, 5, 27, 48, 11, 20, 31, 55, 2, 7, 60, 25, 17, 0};
        System.out.println("unsorted array: " + Arrays.toString(array));

        int in, out;

        for (out = 1; out < array.length; out++) {
            int temp = array[out];
            in = out;
            while (in > 0 && array[in - 1] >= temp) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;
        }
        System.out.println("sorted array " + Arrays.toString(array));
    }
}
