public class Question10 {
    public static void numberPyramid(int rows) {
        // Row
        for (int i = 1; i <= rows; i++) {
            // Space- rows-i
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Number-i
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // Next Line
            System.out.println();

        }
    }

    public static void main(String[] args) {
        numberPyramid(4);
    }
}
