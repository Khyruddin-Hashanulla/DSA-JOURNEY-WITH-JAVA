public class HalfPyramidPattern {

    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int number = 1; number <= row; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}