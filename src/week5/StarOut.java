package week5;

public class StarOut {
    public class starout {
        public static void main(String[] args) {
            String str = "ab*c**d";
            String result="";
            int len = str.length();
            for (int i = 0; i < len; i++) {
                if (str.charAt(i) == '*') {
                    // Skip the star and adjacent characters
                    continue;
                }
                if (i > 0 && str.charAt(i - 1) == '*' || i < len - 1 && str.charAt(i + 1) == '*') {
                    // Skip if the character is adjacent to a star
                    continue;
                }
                result+=str.charAt(i);
            }
            System.out.println(result); // Output: "abcde"

        }
    }
/*
Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".


starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
 */

}
