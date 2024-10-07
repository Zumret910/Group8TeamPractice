package week3;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please input a number");
        int n=input.nextInt();
        int result=1;
        for (int i =n; i >1; i--) {
            result*=i;//5*4*3*2
        }
        System.out.println(result);
        System.out.println("=======================");
        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("factorial2(5) = " + factorial2(5));
    }
    public static int factorial(int input){
        int result=1;
        for (int i = input; i >1; i--) {
            result*=i;//5*4*3*2
        }
        return result;
    }
    public static int factorial2(int input){
        if (input==1){
            return 1;
        }
        return input*factorial2(input-1);
    }

}

/*
create a method that will accept an int number and return factorial of that number
n!=n×(n−1)×(n−2)×…×1
 */


