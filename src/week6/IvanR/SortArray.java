package week6.IvanR;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] arr = {14, 5, 6, 23, 99, 99, 80};

        System.out.println("Sorted arr: " + Arrays.toString(sortArray(arr)));

    }

    public static int[] sortArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                int temp;

                if (arr[j] > arr[j + 1]) {

                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
