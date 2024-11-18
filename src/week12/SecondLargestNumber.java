package week12;

import java.util.Arrays;

public class SecondLargestNumber {
  /*
        Second Largest Number

        Create a method that finds the second largest number in the given array.
        The second largest must be different from the largest number.

        Ex:
            Input:
                [3, 4, 5, 1, 2, 6]
            Output:
                5

     */
    public static int SecondLargest(int[] array) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int each : array) {
            if (each>largest){
                secondLargest=largest;
                largest=each;
            } else if ( each<largest && each>secondLargest) {
                secondLargest=each;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] array = {10, 4, 5, 1, 2, 5,6,9,9,10,7};
        System.out.println(SecondLargest(array));
        System.out.println(secondBiggest(array));

    }
    public static int secondBiggest(int[] array) {
        Arrays.sort(array);
       int second=array[array.length-1];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i]!=second){
                second=array[i];
                break;
            }
        }
       return second;
    }
}
