public class InvertedStarPattern {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int star = 1; star <= n - row + 1; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
