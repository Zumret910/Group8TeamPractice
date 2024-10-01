package week6;

public class LovelyNumber2 {
    public static void main(String[] args) {
        System.out.println(countLovelyNumbers(1000,1011 )); // Example usage
    }
    public static int countLovelyNumbers(int a, int b) {
        int lovelyCount = 0;

        for (int i = a; i <= b; i++) {
            if (isLovely(i)) {
                lovelyCount++;
            }
        }

        return lovelyCount;
    }

    private static boolean isLovely(int num) {
        int[] digitCount = new int[10]; // To count occurrences of each digit
        //[0,1,2,3,4,5,6,7,8,9]
        while (num > 0) {
            int digit = num % 10;//get single digit 1
            digitCount[digit]++;//this single digit must be in the range of 0-9;this digit
            //appear once ,frequency add one;
            if (digitCount[digit] == 3) {//if the frequency of this digit equals to zero,it is an unhappy number
                return false; // Not lovely if any digit appears 3 times
            }
            num /= 10;
        }

        return true; //  no digit appears 3 times
    }
}
