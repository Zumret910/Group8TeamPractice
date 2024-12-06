package week14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
     /*
        Intersection

        Create a method that will return the intersection of the given Set objects.
        The intersection is the shared elements between the Set objects
            parameter: Set<Integer> set1, Set<Integer> set2
            return: Set<Integer>

        Ex:
            input:
                 set1: [3, 4, 1, 7, 2, 6, 5]
                 set2: [6, 2, 5, 1, 8]
            output:
                 [1, 2, 5, 6]
     */
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> result = new HashSet<>();
        for (Integer each : set1) {
            if (set2.contains(each)){
                result.add(each);  // Add the common element to the result set.
            }
        }
        return result;  // Return the intersection set.
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(3, 4, 1, 7, 2, 6, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(6, 2, 5, 1, 8));
        System.out.println(intersection(set1, set2));  // [1, 2, 5, 6]
    }

}
