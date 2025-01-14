package week17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindrome {
    /*
        SortByValue Palindrome Strings

        Create a method that will accept a List of Strings and return the List with all palindrome Strings removed
            parameter: List<String>
            return: List<String>

        Ex:
            input:
                removePalindrome("hello", "java", "anna", "mom", "house", "racecar", "you", "abcba", "pop")
            output:
                [hello, java, house, you]

     */
public static List<String> removePalindrome(List<String> list){
    Iterator iter=list.iterator();

    while(iter.hasNext()){
        Boolean isPalindrome = true;
        String word=(String)iter.next();
        for (int i = 0; i <word.length()/2 ; i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)){
                isPalindrome=false;
                break;
            }
        }
        if (isPalindrome){iter.remove();}
    }
    return list;
}

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("hello", "java", "anna", "mom", "house", "racecar", "you", "abcba", "pop"));
        System.out.println(removePalindrome(list)); // [hello, java, house, you]
    }
}
