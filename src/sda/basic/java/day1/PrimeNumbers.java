package sda.basic.java.day1;

public class PrimeNumbers {
    public static void main(String[] args) {

        boolean result = isPrimeNumber(7);
        System.out.println("Given digit is prime number: " + result);

        for(int i = 5; i < 100; i++) {
            if(isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
        printPrimeNumberFromRange(7, 39);
    }

    private static void printPrimeNumberFromRange(int min, int man) {
        for (int i = min; i < man; i ++) {
            if(isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }


    private static boolean isPrimeNumber(int number) {
        if (number == 0 || number == 1) return false;
        for (int divisor = 2; divisor <= number / 2; divisor++)
            if (number % divisor == 0) return false;

        return true;
    }
}


