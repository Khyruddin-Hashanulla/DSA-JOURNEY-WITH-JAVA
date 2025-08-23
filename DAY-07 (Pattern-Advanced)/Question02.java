public class Question02 {
    public static void halfPyramid(int rows, int cols) {
        // Number of rows
        for (int i = 1; i <= rows; i++) {
            // Print Space
            for (int j = 1; j <= cols - i; j++) {
                System.out.print("  ");
            }
            // Print Star
            for (int s = 1; s <= i; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        halfPyramid(4, 4);
    }
}
