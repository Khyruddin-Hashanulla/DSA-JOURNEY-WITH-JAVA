public class Question04 {
    public static void floTriangle(int number) {
        // Row
        int counter = 1;
        for (int i = 1; i <= number; i++) {
            // How many times will counter be printed
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floTriangle(5);
    }
}
