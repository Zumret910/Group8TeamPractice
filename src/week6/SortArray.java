package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 2, 7, 1, 9, 3, 4, 6};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        arr[0]=98;
        ArrayList<Integer> arrList=new ArrayList<>
        (Arrays.stream(arr).boxed().collect(Collectors.toList()));
        Collections.sort(arrList);
        System.out.println(arrList);
    }
}
