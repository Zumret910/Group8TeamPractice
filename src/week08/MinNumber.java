package week08;

import java.util.Arrays;

public class MinNumber {
    /*
       Min Number

       Create a method that will find and return the min number in an int array
           parameter: int[]
           return: int

       The min number is the smallest value in the array

       Ex:
           input:
               min(3, 5, 1, 5, -1, 5)
           output:
               -1
    */
    public static int min(int[] array){
//        Arrays.sort(array);
//        return array[0];
        int min=array[0];
        for (int each : array) {
            if (each<min){
                min=each;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 5, -1, 5};
        System.out.println(min(array));
    }
}
