package week08;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicateElement {
    /*
        First Duplicate Element

        Create a method that will find and return the first duplicate element
            parameter: int[]
            return: int
                if no duplicate elements are found return 0

        A duplicate element is when the number can be found multiple times in the array

        Ex:
            input:
                findDup(3, 5, 1, 5, -1, 5, 3)
            output:
                3

                -> 3 is the first duplicate found
     */
    public static int findDup(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    return    array[i];
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] array = {1,2, 3, 5, 1, 5, -1, 5, 1, 3};
        System.out.println(findDup(array));
    }
}

