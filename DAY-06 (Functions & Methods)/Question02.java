import java.util.Scanner;

public class Question02 {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        if (isEven(n)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

    }
}
