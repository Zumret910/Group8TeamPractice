package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LovelyNumber {
    /*
        Lovely Number

        Create a method that will count the lovely numbers with the given range.
         The parameters a and b are defined as the lower and upper bounds.
        A number is lovely if it contains fewer than three instances of any distinct digit

        Example of lovely numbers: 0, 100, 1232 and 9922
        Example of non-lovely numbers: 1000 (contains three copies of digit '0'), 33533 (contains four copies of digit '3').

        parameter: int, int
            A and B will be within the range: 0 - 100,000
        return: int

        Ex:
            Given A = 0, B = 0, your function should return 1, because o is
        lovely.

            Given A = 1, B = 111, your function should return 110, because
        the only integer in the range [1..111] that is not lovely is 111.

            Given A = 100000, B = 100000, your function should return 0,
        because 100000 is not lovely.
     */
    public static void main(String[] args) {
        int a =110;
        int b =112;
        int count = 0;

        for(int i = a; i <= b; i++){ // i = 351 -> "351" -> ["3", "5", "1"]
            // 1000 -> [1, 0, 0 , 0]

            List<String> list = new ArrayList<>(Arrays.asList(String.valueOf(i).split("")));
            int before = list.size();//[1,1,1]  3   [1,1,2,1]
            list.removeIf(p -> Collections.frequency(list, p) >= 3);//[1,1,1] 0 1 [2]

            if(list.size() == before){
                count++;
            }


        }
        System.out.println(count);



    }
}
