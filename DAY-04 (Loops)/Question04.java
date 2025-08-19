import java.util.Scanner;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class Question04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " " + "X" + " " + i + " " + "=" + " " + i * n);
        }
    }
}