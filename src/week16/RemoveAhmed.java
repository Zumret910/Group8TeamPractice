package week16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveAhmed {
     /*
        SortByValue Ahmed

        Create a method that will accept a List of names and return the List with all the Ahmed names removed
            parameter: List<String>
            return: List<String>

        Ex:
            input:
                removeAhmed("Ahmed", "John", "Eric", "Ahmed")
            output:
                [John, Eric]

     */
     public static void main(String[] args) {

         List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Sam", "Jane", "Ahmed", "James"));
         System.out.println(removeAhmed(names));
         System.out.println(removeAhmed2(names));

     }

    public static List<String> removeAhmed(List<String> names){
        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            if(iterator.next().equals("Ahmed")){
                iterator.remove();
            }
        }
        return names;
    }

    public static List<String> removeAhmed2(List<String> names) {
        names.removeIf(p -> p.equals("Ahmed"));
        return names;
    }
}
