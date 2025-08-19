public class CharacterPattern {

    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        for (int row = 1; row <= n; row++) {
            for (int chars = 1; chars <= row; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}