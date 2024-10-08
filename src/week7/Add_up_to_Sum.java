package week7;

import java.lang.reflect.Array;

public class Add_up_to_Sum {
    public static void main(String[] args) {
        int[] nums= {8,7,6,4,3,5};
        int sum = 10;

        for(int i=0; i<nums.length; i++){
            for (int each =i+1; each<nums.length; each++) {
                if(nums[i]+nums[each]==sum){
                    System.out.println(nums[i]+"+"+nums[each]+"="+sum);

            }

            }
        }
    }
}
