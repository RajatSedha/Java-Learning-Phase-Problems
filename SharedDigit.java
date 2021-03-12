public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
    }
    public static boolean hasSharedDigit(int number1, int number2) {
        int firstNumber1, lastNumber1, firstNumber2, lastNumber2;


        if (number1 < 11 || number1 > 100 || number2 < 11 || number2 > 100) {
            System.out.println("Please Enter The Valid Input Ranging 10-99 ");
            return false;
        }
        lastNumber1 = number1 % 10;
        firstNumber1 = number1 / 10;
        lastNumber2 = number2 % 10;
        firstNumber2 = number2 / 10;

        if ((lastNumber1 == lastNumber2) || (lastNumber1 == firstNumber2) || (firstNumber1 == firstNumber2) || (firstNumber1 == lastNumber2)) {
            System.out.println("Numbers have a shared digit ");
            return true;
        }
        System.out.println("Numbers does not have any shared digits ");
        return false;
    }
}
