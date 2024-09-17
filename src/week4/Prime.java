package week4;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(15));
        }

    public static boolean isPrime(int n) {

        for (int i = 2; i <n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


/*
To check if a number is prime,
you need to determine if it has any divisors other than 1 and itself.
A prime number is only divisible by 1 and itself. To check if a number n is prime:
Check if it is divisible by any number from 2 to the square root of n. If it is divisible by any of these numbers, it is not prime.
If no divisors are found in this range, the number is prime.
 */
