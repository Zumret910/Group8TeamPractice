package week17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveMoreThan100 {
    /*
        SortByValue More Than 100

        Create a method that will accept an Integer List and return the List with any value greater than 100 removed
            parameter: List<Integer>
            return: List<Integer>

        Ex:
            input:
                removeMoreThan100(1000, 50, 24, 200, 124, 29, -255, 981, 102, 87, 99, 1823)
            output:
                [50, 24, 29, -255, 87, 99]

     */
    public static List<Integer> removeMoreThan100(List<Integer> nums) {
        //option1
        //return nums.stream().filter(num -> num <= 100).collect(Collectors.toList());
        //option 2
//        nums.removeIf(p->p>=100);
//        return nums;
        //option 3
       Iterator<Integer> iterable = nums.iterator();
        while(iterable.hasNext()){
            if(iterable.next()>100)  iterable.remove();
        }
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(1000, 50, 24, 200, 124, 29, -255, 981, 102, 87, 99, 1823));
        System.out.println(removeMoreThan100(input)); // [50, 24, 29, -255, 87, 99]
    }
}
