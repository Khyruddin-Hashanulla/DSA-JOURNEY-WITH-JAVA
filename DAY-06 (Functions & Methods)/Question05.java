public class Question05 {
    public static int digitSum(int number){
        int sum=0;
        while(number>0){
            int lastDig=number%10;
            sum=sum+lastDig;
            number=number/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(digitSum(24256));
    }
}
