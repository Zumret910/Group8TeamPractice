package week3;

public class Finra {
    public static void finra(int n) {
       /* for (int i = 1; i <n ; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("FINRA");
            } else if (i%3==0) {
                System.out.println("FIN");
            } else if (i%5==0) {
                System.out.println("RA");
            }else System.out.println(i);
        }*/
        for (int j = 1; j <=n ; j++) {
            String result = "";
            if ( j% 3 == 0) {
                result += "FIN";
            }
            if (j % 5 == 0) {
                result += "RA";
            }
            System.out.println(result.isEmpty()? j : result);
        }
    }

    public static void main(String[] args) {
        finra(15);
    }
}


