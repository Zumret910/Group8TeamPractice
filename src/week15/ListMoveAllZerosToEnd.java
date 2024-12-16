package week15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListMoveAllZerosToEnd {
     /*
        Move All Zeros To The End

        Create a method that will accept an Integer List and return the List with all the zero elements moved to the end
            parameter: List<Integer>
            return: List<Integer>

        Ex:
            input:
                moveZeros(5, 0, 0, 1, 4, 0, 14, 1)
            output:
                [5, 1, 4, 14, 1, 0, 0, 0]

     */
    public static List<Integer> moveZeros(List<Integer> input) {
       int size=input.size();
       input.removeIf(p->p==0);
        for (int i = input.size(); i < size; i++) {
            input.add(0);
        }
        return input;

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(5, 0, 0, 1, 4, 0, 14, 1));
        System.out.println(moveZeros(list));
    }
}
