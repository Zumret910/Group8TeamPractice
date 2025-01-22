package week17;

public class Binary {
    
  /*
        Binary Representation Of N

        Create a method to determine how many 1s are in the representation of the number in binary form
            parameter: int
            return: int

            The given n will be more than 0

        Ex:
            input: 6
            output: 2

            6 in binary is 110
            there are two '1' digits, so the output is 2

        Test data:
            6 -> 110 -> 2
            7 -> 111 -> 3
            4 -> 100 -> 1
            10 -> 1010 -> 2
            15 -> 1111 -> 4
            16 -> 10000 -> 1
     */
    public static int countBinaryOnes(int n) {
        int count=0;
        String binary="";
       while (n>0) {
           binary=n%2+binary;
           n=n/2;
       }
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i)=='1') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countBinaryOnes(6));
        System.out.println(countBinaryOnes(7));
        System.out.println(countBinaryOnes(4));
        System.out.println(countBinaryOnes(10));
        System.out.println(countBinaryOnes(15));
    }

}
