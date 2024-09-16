package week3;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
        System.out.println(fibonacci2(8));
    }
    public static int fibonacci(int n){
        int a=0;//0
        int b=1;//1
        for (int i = 2; i <=n ; i++) {
            int next=a+b;
            a=b;
            b=next;
        }
        return b;
    }
    public static int fibonacci2(int n){
        if (n<2){
            return n;   //0 1
        }
        return fibonacci2(n-2)+fibonacci2(n-1);
    }
}

/*
The Fibonacci sequence is a series of numbers in which each number (called a Fibonacci number) is the sum of the two preceding numbers. The sequence typically starts with 0 and 1.
 Therefore, the Fibonacci sequence begins as follows:
 0,1,1,2,3,5,8,13,21,34,…
 Create a method that will give you Nth Fibonacci number;Fibonacci number reads like index number,start with 0
 EX:
 n=0  0th fibonacci number is  0
 n=1 first fibonacci number is 1
 n=3  third fibonacci number is 2
 n=8 ....                      21
 */

