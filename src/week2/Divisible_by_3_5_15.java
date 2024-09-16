package week2;

public class Divisible_by_3_5_15 {
    public static void main(String[] args) {
        divisible(30);
    }
    public static void divisible(int num){
        String divisibleBy15="";
        String divisibleBy5="";
        String divisibleBy3="";
        for (int i = 1; i <=num; i++) {
            if(i%15==0){divisibleBy15+=i+" ";} else if (i%5==0) {
                divisibleBy5+=i+" ";}else if ( i%3==0){divisibleBy3+=i+" ";}
        }
        System.out.println("divisibleBy3 = " + divisibleBy3);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy15 = " + divisibleBy15);
    }

}

/*
input:30
output:
Divisible by 15:15,30
Divisible by 5:5,10,20,25
Divisible by 3:3,6,9,12,18,21,24,27


 */

