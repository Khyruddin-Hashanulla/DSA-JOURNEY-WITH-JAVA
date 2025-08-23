public class Question08 {
    public static void hollowRhombus(int rows) {
        // Row
        for (int i = 1; i <= rows; i++) {
            // Space - rows-i
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            //Star - i == 1 || j == 1 || i == rows || j == rows
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || j == 1 || i == rows || j == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // Next Line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRhombus(5);
    }
}
