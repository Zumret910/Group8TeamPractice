package week11;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    /*
      Remove Duplicates

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
}
