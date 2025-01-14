package week11;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Practice {
    /*
        Move Zeros to End

        Create a method that will accept an int array and return an array with all the zeros moved to the end

        Ex:
            Input:
                [5, 0, 2, 0, 0, 1, 0, 23]
            Output:
               [5, 2, 1, 23, 0, 0, 0, 0]
     */
    public static int[] moveZerosToEnd(int[] nums) {
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0 && i!=j){
                nums[j]=nums[i];
                j++;
                nums[i] = 0;// backtrack to avoid skipping the current element
                } else if (i==j && nums[i]!=0){
                nums[j]=nums[i];
                j++; }
        }

        return nums;
    }

    public static int[] moveZeros(int[] nums){
        int[] moved=new int[nums.length];
        int index=0;
        for (int each : nums) {
            if (each!=0){
                moved[index]=each;
                index++;
            }
        }
        return moved;
    }
      /*
        SortByValue Duplicates

        Create a method that will remove the duplicate values from an int array
        The returning array should only have one occurrence of each number

        Ex:
            Input:
                [3, 3, 4, 5, 1, 2, 6, 2, 5, 4, 2, 1, 3]
            Output:
                [3, 4, 5, 1, 2, 6]

     */
public static int[] removeDuplicates(int[] array){
    int[] resultArray = new int[array.length];
    String result="";
    int index = 0;
    for (int each : array) {
        if (!result.contains(each+"")){
        result+=each;
        resultArray[index] = each;
        index++;
    }
    }
    int lenth=result.length();
    return Arrays.copyOf(resultArray,lenth);
}
public static int[] removeDup(int[] array){
    Set<Integer> result=new LinkedHashSet<>();
    for (int each : array) {
        result.add(each);
    }
    Integer[] resultArray = result.toArray(new Integer[0]);
    int[] array2 = Arrays.stream(resultArray).mapToInt(Integer::intValue).toArray();
    //This code uses Java 8's Stream API to convert the Integer[] array to an int[] array. The mapToInt method is used to convert each Integer to an int, and the toArray method is used to create a new int[] array.
    return array2;
}
    public static void main(String[] args) {
        int[] nums = {5, 0, 2, 0, 0, 1, 0, 23};
        System.out.println(Arrays.toString(moveZerosToEnd(nums)));
        System.out.println(Arrays.toString(moveZeros(nums)));
        System.out.println("=============================================");
        int[] array = {3, 3, 4, 5, 1, 2, 6, 2, 5, 4, 2, 1, 3};
        System.out.println(Arrays.toString(removeDuplicates(array)));
        System.out.println(Arrays.toString(removeDup(array)));
    }
}
