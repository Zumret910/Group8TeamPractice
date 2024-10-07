package week2;

public class Division {
    public static void main(String[] args) {
        divideWithoutDivision(6,2);

    }
    public static void divideWithoutDivision(int a,int b){
        int tamp=a;
        int count=0;
        while (tamp>=b){//tamp-b>=0
            count++;
            tamp-=b;
        }
        System.out.println(a +" / "+b+" is "+count+" with the reminder "+tamp);
    }

}
/*
Divide without division
Display the division value as well as any remainder
input :6,2
output: 6/ 2 is 3 with reminder 0
2*3+0=6
6-2 =4  4-2=2  2-2=0


8   3
8-3  5-3  2
2  with reminder 2




 */

