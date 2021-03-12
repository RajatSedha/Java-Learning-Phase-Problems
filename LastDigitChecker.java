public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9,99,999));
    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(a>=10&&a<=1000&&b>=10&&b<=1000&&c>=10&&c<=1000){
            return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
        }
        return false;
    }
    public static boolean isValid(int a){
        if(a>=10&&a<=1000){
            return true;
        }
        return false;
    }
}
