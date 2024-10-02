package week6.IvanR;

public class SecondMaxInArray {

    public static void main(String[] args) {

        int[] arr = {14, 5, 6, 23, 99, 99, 80};

        System.out.println("secondMax(arr) = " + secondMax(arr));

    }

    public static int secondMax(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int each : arr) {

            if (each > max) {

                secondMax = max;
                max = each;
            } else if (each > secondMax && each != max) {

                secondMax = each;
            }
        }

        return secondMax;
    }
}
