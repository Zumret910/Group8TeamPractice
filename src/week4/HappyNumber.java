package week4;

public class HappyNumber {
    public static void main(String[] args) {
        int n=19;
        while (n!=1 && n!=4) {
           int sum=0;
            while (n>0) {//19 1
                int each= n%10;//9 1
                sum+=each*each;//81 +1
                n=n/10;//1
            }
            n=sum;//82


        }
        System.out.println(isHappy(16));


    }
    public static String isHappy(int n) {
        while (n!=1 && n!=4) {
            int sum=0;
            while (n>0) {
               int each= n%10;
               sum+=each*each;
               n=n/10;
            }
            n=sum;

        }
        return (n==1)? "Happy Number" : "Unhappy Number";
    }

}

/*
A happy number is a number that eventually becomes 1 when you repeatedly replace it with
the sum of the squares of its digits.
If it doesn’t reach 1 and instead gets stuck in a loop, it’s not a happy number.
Start with 19.
Sum of squares:
1^2+9^2=1+81=82;(9^2=9*9)
8^2+2^2=64+4=68;
6^2+8^2=36+64=100;
1^2+0^2+0^2=1;
19 is happy number.
Unhappy numbers is a number consistently end up as 4
16
1^2+6^2=1+36=37
3^2+7^2=9+49=58
5^2+8^2=25+64=89
8^2+9^2=64+81=145
1^2+4^2+5^2=1+16+25=42
4^2+2^2+2^2=16+4+4=24
2^2+4^2=4+16=20
2^2+0^2+0^2=4;

 */
