package week12;

import java.util.Arrays;

public class ReverseArray {
    /*
       Reverse Array

       Create a method that will reverse the given array

       Ex:
           Input:
               [3, 4, 5, 1, 2, 6]
           Output:
               [6, 2, 1, 5, 4, 3]

    */
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            result[i] = array[j];
        }
        return result;
    }

    public static int[] reverse2(int[] array) {
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 1, 2, 6};
        System.out.println(Arrays.toString(reverse(array)));
        int[] array2 = {3, 4, 5,9, 1, 2, 6};
        System.out.println(Arrays.toString(reverse2(array2)));
        System.out.println(Arrays.toString(reverse2(array)));
    }
}
