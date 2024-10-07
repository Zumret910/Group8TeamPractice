package week6.IvanR;

public class SwapNumbers {

    public static void main(String[] args) {

        swapNumbers(11, 22);

    }

    public static void swapNumbers(int num1, int num2) {

//        int temp = 0;
//
//        temp = num1;
//        num1 = num2;
//        num2 = temp;

    // without temp var:
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
