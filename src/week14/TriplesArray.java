package week14;

public class TriplesArray {
    /*
        Triples Array

        Create a method that will determine if the array has a triple or not.
        A triple is when an element is repeat 3 times in a row.
        If any number is repeat 3 times in a row return false. If the array does not have any triples return true

        Ex:
            noTriples([1, 1, 2, 2, 1]) → true
            noTriples([1, 1, 2, 2, 2, 1]) → false
            noTriples([1, 1, 1, 2, 2, 2, 1]) → false

     */
    public static boolean noTriples(int[] array) {
        boolean noTriples = true;
        for (int i = 0; i < array.length - 2; i++) {
           if (array[i]==array[i+1] && array[i+1]==array[i+2]) {
               noTriples = false;
               break;  // If a triple is found, break the loop to optimize performance.
           }
        }
        return noTriples;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 1,2};
        int[] array2 = {1, 1, 2, 2, 2, 1};
        int[] array3 = {1, 1, 2, 2, 1};

        System.out.println(noTriples(array1)); //
        System.out.println(noTriples(array2)); //
        System.out.println(noTriples(array3)); //
    }
}

