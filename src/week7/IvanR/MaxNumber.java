package week7.IvanR;

public class MaxNumber {

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 5, -1, 5};
        int[] arr2 = {33, -45, 100, 5, -100, 5, 99, 100};
        int[] arr3 = {-20, 5, 111, 55, 111, 105, -20};

        System.out.println("maxInArray(arr) = " + maxInArray(arr));
        System.out.println("maxInArray(arr2) = " + maxInArray(arr2));
        System.out.println("maxInArray(arr3) = " + maxInArray(arr3));

    }

    public static int maxInArray(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int each : arr) {

            if (each > max) {
                max = each;
            }
        }
        return max;
    }
}
 /*
Max Number

Create a method that will find and return the max number in an int array
    parameter: int[]
    return: int

The max number is the biggest value in the array

Ex:
    input:
        max(3, 5, 1, 5, -1, 5)
    output:
*/
