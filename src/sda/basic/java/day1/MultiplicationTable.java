package sda.basic.java.day1;

public class MultiplicationTable {
    public static void main(String[] args) {

        printMultiTable(6,0,5);
    }


    private static void printMultiTable(int multiplier, int minMultiplicand, int maxMultiplicand) {

        for (; minMultiplicand<=maxMultiplicand; minMultiplicand++) {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " * " + minMultiplicand + " = " + result);
        }
    }
}
