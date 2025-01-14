package week17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveNum {
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
        // Your implementation here
       //return nums.stream().filter(num -> num <= 100).toList();
        nums.removeIf(p->p>=100);
        return nums;
    }
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(1000, 50, 24, 200, 124, 29, -255, 981, 102, 87, 99, 1823));
        System.out.println(remove100(input)); // [50, 24, 29, -255, 87, 99]
       // System.out.println(removeMoreThan100(input)); // [50, 24, 29, -255, 87, 99]
    }
    public static List<Integer> remove100(List<Integer> nums) {
        Iterator iter=nums.iterator();
        while(iter.hasNext()){
            int num=(int)iter.next();
            if(num>100)
                iter.remove();
        }
        return nums;
    }
}
