package week17;

import java.util.LinkedHashMap;
import java.util.Map;

public class TimeSeries {
      /*
        Time Series

        Create a method that will return the summation of the given time series. A time series will be a Map holding
        a time/value pair. Given two time series combine them together. When a time is matched in both series the values are combined
            parameter: Map<Integer, Double>
            return: Map<Integer, Double>

        Ex:
            input:
                 series A: {1=1.0, 2=1.5, 3=2.0}
                 series B: {2=1.0, 3=2.5, 5=1.0}
            output:
                 {1=1.0, 2=2.5, 3=4.5, 5=1.0}
     */
    public static Map<Integer, Double> combineTimeSeries(Map<Integer, Double> seriesA, Map<Integer, Double> seriesB) {
        Map<Integer,Double> result=new LinkedHashMap<>();
        for (Map.Entry<Integer, Double> entryA : seriesA.entrySet()) {
            result.put(entryA.getKey(),entryA.getValue());
            if (seriesB.containsKey(entryA.getKey())){
                result.put(entryA.getKey(), entryA.getValue() + seriesB.get(entryA.getKey()));
            }
            }
        for (Map.Entry<Integer, Double> entryB : seriesB.entrySet()) {
            if (!result.containsKey(entryB.getKey())){
                result.put(entryB.getKey(), entryB.getValue());
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Map<Integer, Double> seriesA = Map.of(1, 1.0, 2, 1.5, 3, 2.0);
        Map<Integer, Double> seriesB = Map.of(2, 1.0, 3, 2.5, 5, 1.0);
        System.out.println(combineTimeSeries(seriesA, seriesB));  // Output: {1=1.0, 2=2.5, 3=4.5, 5=1.0}

    }

    }


