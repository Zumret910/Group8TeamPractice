package Utils;

import java.util.ArrayList;

public class ArraysvsArrayList {
    public static void main(String[] args) {
        int[] numbers = new int[3]; // Fixed size of 3
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
// Accessing elements
        System.out.println(numbers[1]); // Output: 20

        ArrayList<Integer> numbersList = new ArrayList<>(); // Dynamic size
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
// Accessing elements
        System.out.println(numbersList.get(1)); // Output: 20
    }
}
//Arrays and ArrayLists are both used to store collections of elements in Java, but they have distinct differences in terms of functionality, flexibility, and usage. Here's a comparison of Arrays and ArrayLists to highlight their key differences: