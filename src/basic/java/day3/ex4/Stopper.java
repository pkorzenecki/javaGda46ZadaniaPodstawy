package basic.java.day3.ex4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Stopper {
    public static void main(String[] args) {
        stopper();
    }
    private static void stopper() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("To start timing press ENTER");
        scanner.nextLine();
        LocalDateTime startTime = LocalDateTime.now();

        System.out.println("Processing...");

        System.out.print("To stop timing press ENTER");
        scanner.nextLine();
        LocalDateTime stopTime = LocalDateTime.now();

        Duration timeBetweenEnters = Duration.between(startTime, stopTime);
        int result = (int) timeBetweenEnters.getSeconds();

        System.out.println("Time between ENTERs is equal to: " + result + " sec");
    }
}
