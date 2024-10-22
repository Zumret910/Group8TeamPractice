package week09;

import java.util.*;

public class FrequencyOfEachElement {
    /*
        Frequency Of Each Element

        Given an array find the frequency of each element.
        The frequency is the number of times each element appears in the array

        Ex:
            input:
                frequencyElement("Apple","Banana","Apple","Cherry")
            output:
                Apple = 2
                Banana = 1
                Cherry = 1
     */
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
        Map<String, Integer> frequency = new HashMap<>();
        for (String each : arr) {
            if (!frequency.containsKey(each)) {
                frequency.put(each, 0);
            }
            frequency.put(each, frequency.get(each) + 1);

        }
        //  System.out.println(frequency);
        frequency.forEach((k, v) -> System.out.println(k + " = " + v));

    }
    public static void frequencyCollections(String... arr) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        for (String each : list) {
            int cont = Collections.frequency(list, each);
            System.out.println(each + " = " + cont);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "Apple", "Cherry"};
        frequancyElement(arr);
        System.out.println("================================");
       frequencyHashMap(arr);
        System.out.println("================================");
        frequencyCollections(arr);
        System.out.println("================================");


    }

}