package week2;

public class ConsecutiveNumber {
    public static void main(String[] args) {
        consecutive(16);
    }
    public static void  consecutive(int input){


        if (input>0){
            for (int i = 1; i <input ; i++) {
                String result="";
                if (i%2==0){result+="Codility";}
                if (i%3==0){result+="Test";}
                if (i%5==0){result+="Coders";}
                if (i%2!=0 && i%3!=0 && i%5!=0){result+=i;}
                System.out.println(result);}

        } else{System.out.println("invalid number");}
    }
}


/*
print consecutive number 1 to N,each number on separate line;
number divisible by 2,3 or 5    replace with  "Codility","Test","Coders"
divisible by more than one       replace with concatenation of each word
N >0
1,
"Codility"
 */


