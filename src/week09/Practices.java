package week09;

import java.util.*;

public class Practices {
    public static void frequancyElement(String[] arr) {

        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (!(result.contains(arr[i]))) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                result += arr[i] + " = " + count + "\n";
            }

        }
        System.out.println(result);
    }

    public static void frequencyHashMap(String... arr) {
        Map<String, Integer> frequency = new HashMap<String, Integer>();
        for (String each : arr) {
            if (!frequency.containsKey(each)) {
                frequency.put(each, 0);
            }
            frequency.put(each, frequency.get(each) + 1);

        }
        //  System.out.println(frequency);
        frequency.forEach((k, v) -> System.out.println(k + " = " + v));

    }

    /*
        Frequency of Each Element in Words

        Given an array find the frequency of each element.
        The frequency is the number of times each element appears in the array.
         Output the frequency in a sentence using words to represent the number

        Constraints: a frequency can be any number from 1 to 10.
        If any frequency goes above 10 output: "more than 10" as the message

        Ex:
            input:
                frequencyElement(1,2,3,4,3,2,1,3,2,2,2,4)
            output:
                1 is two
                2 is five
                3 is three
                4 is two
     */
     public static void frequencyNumber(int[] arr) {
        String result="";
         for (int each : arr) {
             int count=0;
             if (!result.contains(each+"")){
                 for (int i : arr) {
                     if (each==i){
                         count++;
                     }
                 }
                 String number="";
                 switch (count){
                     case 1 -> number="one";
                     case 2-> number="two";
                     case 3->number="three";
                     case 4-> number="four";
                     case 5-> number="five";
                     case 6-> number="six";
                     case 7-> number="seven";
                     case 8-> number="eight";
                     case 9-> number="nine";
                     case 10-> number="ten";
                         default -> number="more than 10";
                 }
                 result+=each+" is "+number+"\n";
             }
         }
         System.out.println(result);
    }
    public static void freNumMap(int[] arr){
         Map<Integer, Integer> map = new LinkedHashMap<>();
         for (Integer num : arr) {
            if (!map.containsKey(num)){
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);

         }
         String[] str={"","one","two","three","four","five","six","seven","eight","nine","ten","more than ten"};

//         for(int key: map.keySet()){
//
//         }

         map.forEach((k,v)-> System.out.println(k+" is "+str[v]));


             }

    public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "Apple", "Cherry"};
        frequancyElement(arr);
        System.out.println("================================");
        //task first solution --2
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        for (String each : list) {
            int cont = Collections.frequency(list, each);
            System.out.println(each + " = " + cont);
            System.out.println("================================");
            frequencyHashMap(arr);
            System.out.println("================================");

            int[] arr2={3,4,5,6,5,8,5,3,2,3,4,5,5,5,2,4,2};
            frequencyNumber(arr2);
            System.out.println("================================");
            freNumMap(arr2);

        }
    }

}


