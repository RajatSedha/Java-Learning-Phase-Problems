public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int a) {
        if (a < 1)
            return false;
        int sum = 0;
        for (int i = 1; i <a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        return a == sum;
    }
}
