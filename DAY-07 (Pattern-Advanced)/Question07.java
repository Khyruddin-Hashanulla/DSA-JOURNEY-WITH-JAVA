public class Question07 {
    public static void solidRhombus(int rows) {
        // Row
        for (int i = 1; i <= rows; i++) {
            // Space - rows-i
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Star - rows
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            // New Line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solidRhombus(5);
    }
}
