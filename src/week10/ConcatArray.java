package week10;

import java.util.ArrayList;

public class ConcatArray {
    /*
        Concat Arrays

        Create a method that will take two int arrays and concat them into one array.
         Concat the arrays by combining them into one array

        Ex:
            Input:
                [1, 4, 5], [8, 12, 5, 9]
            Output:
                [1, 4, 5, 8, 12, 5, 9]
     */
    public static int[] concatArray(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        for (int i = 0, j = 0; i < result.length; i++) {
            if (i < array1.length) {
                result[i] = array1[i];
            } else {
                result[i] = array2[j];
                j++;
            }
        }
        return result;
    }

}
