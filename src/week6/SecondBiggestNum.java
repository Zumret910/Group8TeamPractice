package week6;

public class SecondBiggestNum {
    public static void main(String[] args) {
        int arr[] = {-10, 20, 4, -30, -50, 11, 87, -80};
        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second largest number: " + secondMax);
    }
}
