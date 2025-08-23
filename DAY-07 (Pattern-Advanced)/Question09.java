public class Question09 {
    public static void diamond(int rows) {
        // <---1st Half--->
        // Rows
        for (int i = 1; i <= rows; i++) {
            // Space- n-i
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Star- 2i-1
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            // Next Line
            System.out.println();
        }
        // <---2nd Half--->
        // Row
        for (int i = rows; i >= 1; i--) {
            // Space- n-i
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Star- 2i-1
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            // Next Line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond(10);
    }
}
