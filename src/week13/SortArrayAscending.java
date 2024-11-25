package week13;

import java.util.Arrays;

public class SortArrayAscending {
    /*
       Sort Array Ascending

       Create a method that will sort the given array in ascending order (smallest to largest).

       DO NOT USE any built in methods

       Ex:
           Input:
               [3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6]
           Output:
               [-1, 1, 1, 2, 3, 3, 4, 5, 6, 6, 8]

    */
    public static int[] sortArrayAscending(int[] array) {
        // int count = 0;
        for (int i = 0; i < array.length; i++) {//i=1 //i=2
            int temp = array[i];//temp=4//temp=4
            int smallestNumIndex = i;//1//2
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < temp) {
                    temp = array[j];//-1 //1//1
                    smallestNumIndex = j;//6//2//8
                }
            }
            if (smallestNumIndex != i) {
                array[smallestNumIndex] = array[i];//array[6]=3  //array2=4//array8=4
                array[i] = temp;//array[0]=-1//array1=1//array2=1
            }
        }
        return array;
    }

    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int temp = array[j];
                if (array[j] > array[j + 1]) {
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array = {3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6};
        System.out.println(Arrays.toString(sortArrayAscending(array)));
        System.out.println("==================================");
        int[] array2 = {3, 4, 1, 3, 8, 6};
        System.out.println(Arrays.toString(sortArray(array2)));
    }


}
