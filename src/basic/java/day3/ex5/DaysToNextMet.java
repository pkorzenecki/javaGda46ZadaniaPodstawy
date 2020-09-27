package basic.java.day3.ex5;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaysToNextMet {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert date [in format yyyy MM dd HH:mm:ss]");
        String input = scanner.nextLine();

        DateTimeFormatter patternOfDate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateOfNextMet = LocalDateTime.parse(input, patternOfDate);

        LocalDateTime currentTime = LocalDateTime.now();

        long timeBetween = Duration.between(currentTime, dateOfNextMet).toDays();

        System.out.println("You have " + timeBetween + " days to next lesson");
        System.out.println(String.format("You have %02d days to next lesson", timeBetween));

        //TimeUnit - skorzystać z tej klasy

    }
}
