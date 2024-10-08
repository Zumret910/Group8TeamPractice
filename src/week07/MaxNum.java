package week07;

public class MaxNum {
    /*
        Max Number

        Create a method that will find and return the max number in an int array
            parameter: int[]
            return: int

        The max number is the biggest value in the array

        Ex:
            input:
                max(3, 5, 1, 5, -1, 5)
            output:
                5
     */
    public static int maxNum(int[]arr){
        int max=Integer.MIN_VALUE;//max=arr[0]
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
    public static void main(String[] args){
        int[] arr={3, 5, 1, 5, -1, 5};
        System.out.println("maxNum(arr) = " + maxNum(arr));
    }
}
