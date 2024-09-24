package week5;

public class SumDigitsUntilOne {
    public static int sumDigit(int num){
        while (num/10!=0){
        int sum=0;
        while (num/10 != 0){
          sum+=num%10;
          num=num/10;//15
           }
        num=sum;
    }
      return num;
}}
/*
create a method to calculate the sum of digits of a given number until the sum
becomes a single digit.
Example:
    Input: 12345
    Output: 15
    Explanation: 1+2+3+4+5=15,
    then 1+5=6 output:6
    Input: 45659
    Explanation: 4+5+6+5+9=29,
    then 2+9=11,1+1=2
    output:2



 */