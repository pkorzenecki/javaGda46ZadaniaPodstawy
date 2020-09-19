package sda.basic.java.day1;

public class CalculateOnTwoDigits {
    public static void main(String[] args) {
       int sum =  sumDigits(4, 11);
        System.out.println("Suma: " + sum);

    }

    private static int sumDigits(int min, int max) {
        int result = 0;
        /*for(int i = min; i <= max; i++) {
            result += i;
        }
        return result;*/

        //alternatywnie w while:

        int counter = min;
        while (counter <= max) {
            result += counter;
            counter++;

        }
        return result;
    }
}
