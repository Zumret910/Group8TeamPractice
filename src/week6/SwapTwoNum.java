package week6;

public class SwapTwoNum {
    public static void main(String[]arg){
        swap(23,12);
    }
    public static void swap(int num1,int num2){
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

