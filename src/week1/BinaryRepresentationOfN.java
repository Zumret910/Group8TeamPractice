package week1;

public class BinaryRepresentationOfN {
    public static void main(String[] args) {
        int num=7;
        String binary="";
        int tem=0;
        while (num>0){
            tem= num%2;
            if (tem!=0){binary=binary+tem;}
            num=num/2;
        }
        System.out.println(binary);
        int digitOne=binary.length();
        System.out.println(digitOne);
    }

}

/*
Ex:
153
3                5        1
10^0*3+  10^1*5+ 10^2*1=153
153%10=3     15%10=5;    1%10=1
153/10=15    15/10=1;

6=110   2^0*(0 ) + 2^1*(1 )  +  2^2 *(1) =6
7=111   2^0*(1 ) + 2^1*(1 )  +  2^2 *(1) =7
  2^0*(0 ) + 2^1*(1 )  +  2^2 *(1)
6%2=0     3%2=1         1%2=1
6/2=3     3/2=1         1/2=0

input :6  110  7:7%2  1
7/2=3    3%2=1   3/2=1
output:2   2
6 in binary 110,there are two 1 digit,so out put is 2
 */

