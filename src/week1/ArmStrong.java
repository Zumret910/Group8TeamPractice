package week1;

public class ArmStrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));

    }

    public static boolean isArmstrong(int number){
        String input=""+number;
        int pow=input.length();
        int sum=0;

       /*for (int i = 0; i < pow; i++) {
           int eachDigit=Integer.parseInt(""+input.charAt(i));
          sum+=Math.pow(eachDigit,pow);

       }*/
        int temp=number;//temp=153;
        while (temp>0){
            int temSum=1;
            int eachDigit=temp%10;//153%10=15*10+3=3;
            for (int i = 0; i <pow; i++) {
                temSum*=eachDigit;//3*3*3
            }
            sum+=temSum;
            temp/=10;
        }


        return sum==number;
    }


}
/*
check if the number is an Armstrong number/narcissistic number
parameter:int
return :boolean
EX:
input:153     3
out:true

1^3+2^3+5^3=153
 */


