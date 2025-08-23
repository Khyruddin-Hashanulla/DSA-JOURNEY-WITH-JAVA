import java.util.*;
public class Question01 {
    public static void hollowRec(int totRows, int totCols) {
        // Outer loop define number of rows.
        for (int i = 1; i <= totRows; i++) {
            // Inner loop define number of columns
            for (int j = 1; j <= totCols; j++) {
                // Cell(i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        hollowRec(rows, cols);
    }
}
