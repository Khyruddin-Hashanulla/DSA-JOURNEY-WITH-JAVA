public class Question01 {
    public static double avgNum(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 30;
        double c = 25;
        System.out.println("Average of Three Number is: " + avgNum(a, b, c));
    }
}
