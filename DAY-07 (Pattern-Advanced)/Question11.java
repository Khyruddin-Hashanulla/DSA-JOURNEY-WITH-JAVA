public class Question11 {
    public static void palindromic(int rows){
        // Row loop
        for(int i=1; i<=rows; i++){
            // Space: rows-i
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }

            // Descending numbers (i → 1)
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            // Ascending numbers (2 → i)
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }

            // Next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        palindromic(5);
    }
}