import java.util.Scanner;

public class Question03 {
    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;
        while (palindrome > 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if (number == reverse) {
        // return true;
        // } else {
        // return false;
        // }
        return number == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println("Number : " + number + " is a palindrome");
        } else {
            System.out.println("Number : " + number + " is not a palindrome");
        }
    }
}
