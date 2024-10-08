package week07;

public class SecondNum {
    public static void main(String[] args){
        int[] array = {8, 7, 2, 5,6, 3,8, 1};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int each : array) {
            if (each>max){
                secondMax=max;//keep tracking first max
                max=each;}
            else if (each>secondMax & each!=max){
                secondMax=each;
            }

        }
        System.out.println("secondMax = " + secondMax);

    }
}
