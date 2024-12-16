package week15;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IterateSet {
     /*
        Iterate a Set

        Create a program to iterate through a Set and print the values. The main focus here is to check your understanding of collection types and how Set is different from others

        Ex:
            input:
                 set: ["java", "selenium", "sql", "api"]
            output:
                java
                selenium
                sql
                api
     */
    public static void iterateSet(Set input){
        Iterator<String> iterSet=input.iterator();
       while (iterSet.hasNext()){
           System.out.println(iterSet.next());
            }

        }


    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("java");
        set.add("selenium");
        set.add("sql");
        set.add("api");
        iterateSet(set);
    }
}
