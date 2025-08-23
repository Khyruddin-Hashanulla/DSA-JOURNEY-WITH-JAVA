public class Question06 {
    public static void butterfly(int rows) {
        // <---1st Half--->
        // Rows
        for (int i = 1; i <= rows; i++) {
            // Star - i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Space - 2*(rows-i)
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print("  ");
            }
            // Star - i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Next Line
            System.out.println();
        }
        // <---2nd Half--->
        // Rows
        for (int i = rows; i >= 1; i--) {
            // Star - i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Space - 2*(rows-i)
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print("  ");
            }
            // Star - i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Next Line
            System.out.println();
        }

    }

    public static void main(String[] args) {
        butterfly(5);
    }
}
