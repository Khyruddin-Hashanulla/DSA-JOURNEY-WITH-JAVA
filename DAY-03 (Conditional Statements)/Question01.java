import java.util.*;
public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int x=sc.nextInt();
        if(x>0){
            System.out.println("It is positive number");
        }else{
            System.out.println("It is negative number");
        }
    }
}
