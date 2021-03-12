public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
    }


    public static int sumFirstAndLastDigit(int number) {
        int lastDig=0,sum=0,firstDig=0;
        if(number<0){
            return -1;
        } else {
            lastDig=number%10; // get the last digit
            firstDig=number; // store number as first digit
            while(firstDig>9) { //while the firstDigit is considered a 2 digit number
                firstDig/=10; // make the firstDigit a one digit number.
            }
            sum=firstDig+lastDig; // add first digit and last digit and return sum.
            return sum;
        }
    }

    }
