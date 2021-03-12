public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456));
    }

    public static int getEvenDigitSum(int number) {
        if (number > 0) {
            int test = number;
            int evenSum = 0;
            while (test != 0) {
                int rem = test % 10;
                if (rem % 2 == 0) {
                    evenSum += rem;
                }
                test /= 10;
            }
            return evenSum;
        }
        return -1;
    }
}
