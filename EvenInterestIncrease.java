public class EvenInterest {
    public static void main(String[] args) {
        calculateInterest(10000);
    }
    public static void calculateInterest(int number){
        double interest = 0;
        if(number>=0) {
            for (int i = 2; i <= 8; i++) {
                interest = (number * i) / 100.00;
                System.out.println(interest);
            }
        }
    }
}
