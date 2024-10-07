package Git_Practice;

public class Triangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the triangle

        for (int i = 1; i <= n; i++) {
            // Print spaces for alignment
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print asterisks for the triangle
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
