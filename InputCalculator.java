import java.util.Scanner;
public class InputCalculator {
    public static void main(String[] args) {
    inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        double avg = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a Number: ");
            boolean n = scanner.hasNextInt();
            if(n) {
                count++;
                int number= scanner.nextInt();
                sum = sum + number;
                avg = (double) sum / count;
                System.out.println("Sum = " + sum + " Average = " + avg);
            }
            else{
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
