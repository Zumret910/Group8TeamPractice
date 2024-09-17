package week4;

public class MaximumValue {
    public static void main(String[] args) {
        System.out.println(findMaxValue(-23));
        System.out.println(findMaxValue(87));
        System.out.println(findMaxValue(23));
        System.out.println(findMaxValue(81));
        int n = 81;
        boolean isPositive = n >= 0;
        // boolean isAdded=false;
        String strNum = String.valueOf(n);
        for (int i = 0; i < strNum.length(); i++) {
            int eachDigit = Integer.parseInt(strNum.substring(i, i + 1));
            if (isPositive && eachDigit < 5 || !isPositive && eachDigit > 5) {
                strNum = strNum.substring(0, i) + 5 + strNum.substring(i);
                break;
            }
        }
        if (strNum.length() == String.valueOf(n).length()) {
            strNum = strNum + 5;
        }
        System.out.println(strNum);
    }


    public static int findMaxValue(int n) {
        //123  "123"  String.valueOf(n) int----String
        //Integer.parseInt(str)    String-  int
        //Integer.valueOf(str)    string-Integer
        boolean isPositive = n >= 0;
        n=Math.abs(n);//-n n
        String strNum = String.valueOf(n);
        for (int i = 0; i < strNum.length(); i++) {
            int eachDigit = Integer.parseInt(strNum.substring(i, i + 1));
            if (isPositive && eachDigit < 5 || !isPositive && eachDigit > 5) {
                strNum = strNum.substring(0, i) + 5 + strNum.substring(i);
                break;
            }
        }
        if (strNum.length() == String.valueOf(n).length()) {
            strNum = strNum + 5;
        }
        return isPositive?Integer.parseInt(strNum):(Integer.parseInt(strNum))*-1  ;
    }

}
/*
Create a method that will return the maximum possible value of the given number
 by inserting the digit 5;
bounds of N:-8000-8000
n=233   output:5233
n=670    output:6750
n=-99    output:-599(-599>-995)
 */

