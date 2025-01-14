package week17;

import java.util.*;

public class SortByValue {
    /*
        Sort by Value
        Create a method that sort the given Map by the value
            parameter: Map<String, Integer>
            return: Map<String, Integer>
            assume the values are Integer that should be sorted smallest to largest
        Ex:
            input:
                sortByValue( {b=1, a=4, n=2, z=0, p=3, l=1, e=2, i=1} )
            output:
                [z=0, b=1, i=1, l=1, e=2, n=2, p=3, a=4]
     */
    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        Map<String, Integer> result = new LinkedHashMap<>();
        List<Integer> values = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            values.add(entry.getValue());
        }
        Collections.sort(values);
        for (int i = 0; i < values.size(); i++) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == values.get(i)) {
                    result.put(entry.getKey(), entry.getValue());
                    map.remove(entry.getKey());
                    break;
                }
            }
        }
        return result;

    }

    public static Map<String, Integer> sortByValue2(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        for (int i = 0; i < entries.size(); i++) {
            for (int j = 0; j < entries.size() - 1; j++) {
                if (entries.get(j).getValue() > entries.get(j + 1).getValue()) {
                    Map.Entry<String, Integer> temp = entries.get(j);
                    entries.set(j, entries.get(j + 1));
                    entries.set(j + 1, temp);
                }
            }

        }
        Map<String, Integer> sorted = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> each : entries){
            sorted.put(each.getKey(), each.getValue());
        }

        return sorted;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(Map.of("b", 1, "a", 4, "n", 2, "z", 0, "p", 3, "l", 1, "e", 2, "i", 1));
        System.out.println(sortByValue(map));
        Map<String, Integer> map2 = new HashMap<>(Map.of("b", 1, "a", 4, "n", 2, "z", 0, "p", 3, "l", 1, "e", 2, "i", 1));
        System.out.println(sortByValue2(map2));
    }
}
