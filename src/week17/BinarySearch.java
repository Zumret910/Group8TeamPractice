package week17;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == target){
                return i;
            }
            }
        return -1;
        }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
    }

