package week14;

import java.util.*;

public class FrequencyOfCharacter {
     /*
        Frequency of Character

        Create a method that will determine the frequency of every character in the given String
            parameter: String
            return: void

        Ex:
            input:
                frequencyOfCharacter("banana apple pie")
            output:
                {b=1, a=4, n=2,  =2, p=3, l=1, e=2, i=1}
     */
public static void frequencyOfChart(String str){
    List<String> ch=new ArrayList<>(Arrays.asList(str.split("")));
    String result="";
    for(String each:ch){
        if (!result.contains(each) && !each.isBlank())
        { System.out.print(each+"="+ Collections.frequency(ch,each)+", ");}
        result=result+each;
    }
}
public static void frequencyOfCharMap(String str){
    Map<Character,Integer>frequency=new HashMap<>();
    str=str.replace(" ","");
    for (int i = 0; i < str.length(); i++) {
        if (!frequency.containsKey(str.charAt(i))){
            frequency.put(str.charAt(i),0);
        }
        frequency.put(str.charAt(i),frequency.get(str.charAt(i))+1);
    }
    System.out.println(frequency);
}

    public static void main(String[] args) {
        frequencyOfChart("banana apple pie");
        frequencyOfCharMap("banana apple pie");
    }
}
