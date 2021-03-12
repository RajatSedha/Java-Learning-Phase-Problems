public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(727));
    }

    public static boolean isPalindrome(int number) {
        int test = number;
        int reverse = 0;
        while (test != 0) {
            int remainder = test % 10;
            reverse = (reverse * 10) + remainder;
            test = test / 10;
        }
        return reverse==number;
    }
}
