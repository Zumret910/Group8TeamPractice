package week13;

import java.util.Arrays;

public class SortArrayDescending {
     /*
        Sort Array Descending

        Create a method that will sort the given array in descending order (largest to smallest).

        DO NOT USE any built in methods

        Ex:
            Input:
                [3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6]
            Output:
                [8, 6, 6, 5, 4, 3, 3, 2, 1, 1, -1]

     */
     public static int[] sortDescending(int... arr){

         for(int i = 0; i < arr.length; i++){
             System.out.println("--------- i: " + i);
             for(int j = 0; j < arr.length - 1; j++){
                 if(arr[j] < arr[j + 1]){
                     System.out.println("Swapping " + arr[j] + " and " + arr[j+1]);
                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                 }

                 System.out.println("Array after j index of " + j + " | " + Arrays.toString(arr));
             }
         }
         return arr;
     }

    public static int[] sortArrayDescending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int largestNumIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > temp) {
                    temp = array[j];
                    largestNumIndex = j;
                }
            }
            if (largestNumIndex != i) {
                array[largestNumIndex] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
     public static void main(String[] args){
         int[] arr = {3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6};
         System.out.println(Arrays.toString(sortDescending(arr)));
         System.out.println("==================================");
         int[] array2 = {3, 4, 1, 3, 8, 6};
         System.out.println(Arrays.toString(sortArrayDescending(array2)));
     }
}
