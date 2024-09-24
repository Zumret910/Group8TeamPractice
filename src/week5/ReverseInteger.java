package week5;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("reverseInteger(56) = " + reverseInteger(56));
        System.out.println(reverseInteger(546));
    }
    public static int reverseInteger(int num){
        int reverse=0;
        while (num>0){
        reverse=reverse*10+ num%10;// 6 +5
        num=num/10;
        }
        return reverse;
    }



}
/*
Write a function that takes an integer as input and returns the reversed
version of the input.
reverse using only numbers,not strings
Example:
Input: 12345
Output: 54321
 */