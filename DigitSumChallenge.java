public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(456));
    }
    public static int sumDigits(int number){
        int sum = 0;
        if(number>=10) {
            while (number != 0) {
                int lastDigit = number % 10;
                sum += lastDigit;
                number /= 10;
            }
        }
        return sum;
    }
}
