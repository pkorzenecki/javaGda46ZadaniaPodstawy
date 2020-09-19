package sda.basic.java.day1;

import java.util.Scanner;

public class MathExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę x: ");
        int x = sc.nextInt();
        System.out.println("Wprowadź drugą liczbę y: ");
        int y = sc.nextInt();

        boolean result;

        result = x > y ? true : false;
        System.out.println("x is grater than y: " + result);

        result = (x * 3) > y ? true : false;
        System.out.println("x multiplified by 3 is grater than y: " + result);

        result = (y++ < ++x) && (--x < y++);
        System.out.println(result);

        result = (x*y) % 2 == 0;

        System.out.println(result);
    }
}
