package week07;

public class AddUpToSum {
    /*
        Add Up to Sum

        Given an int array and an int representing the sum number, create a program that can find the pair
       of numbers from the array that add up to the sum number

        Add the numbers from the array to determine the possible pairs that add up to the sum

        Ex:
            array = [8, 7, 2, 5, 3, 1]
            sum = 10

            output:
                8 & 2
                7 & 3
     */
    public static void main(String[] args) {
        int[] array = {8, 7, 2, 5, 3, 1};
        addUpToSum(array, 10);
    }

    public static void addUpToSum(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            int temp = sum - array[i];//2 3
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == temp) {
                    System.out.println(array[i] + " & " + array[j]);
                }
            }
        }
    }

}
