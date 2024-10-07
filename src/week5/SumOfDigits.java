package week5;

public class SumOfDigits {
    public static int sumOfDigits(int number) {
        int sum=0;
        while (number>0){
            sum=sum+number%10;
            number=number/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 214;
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);  // Output: 15
    }
}
/*
Create a method to calculate the sum of digits of a given number.
Example:
    Input: 12345
    Output: 15
    Explanation: 1+2+3+4+5=15

 */