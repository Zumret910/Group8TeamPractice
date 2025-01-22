package week17;

public class Factorial {

        public static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1; // Base case
            }
            return n * factorial(n - 1); // Recursive case
        }

        public static void main(String[] args) {
            int number = 5;
            System.out.println("Factorial of " + number + " is: " + factorial(number));
        }
    }

