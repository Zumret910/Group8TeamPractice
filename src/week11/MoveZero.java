package week11;

public class MoveZero {
    /*
        Move Zeros to End

        Create a method that will accept an int array and return an array with all the zeros moved to the end

        Ex:
            Input:
                [5, 0, 2, 0, 0, 1, 0, 23]
            Output:
               [5, 2, 1, 23, 0, 0, 0, 0]
     */
    public static int[] moveZerosToEnd(int[] nums) {
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0 && i!=j){
                nums[j]=nums[i];
                j++;
                nums[i] = 0;// backtrack to avoid skipping the current element
            } else if (i==j && nums[i]!=0){
                nums[j]=nums[i];
                j++; }
        }

        return nums;
    }

    public static int[] moveZeros(int[] nums){
        int[] moved=new int[nums.length];
        int index=0;
        for (int each : nums) {
            if (each!=0){
                moved[index]=each;
                index++;
            }
        }
        return moved;
    }
}
