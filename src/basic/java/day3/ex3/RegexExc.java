package basic.java.day3.ex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExc {
    public static void main(String[] args) {
        System.out.println(isCorrectFormat("-1234,4567"));
        System.out.println(isCorrectFormat("-1234,"));
        System.out.println(isCorrectFormat("1234a4567"));
        System.out.println(isCorrectFormat("1234"));
        System.out.println(isCorrectFormat("-1234"));
    }
    private static boolean isCorrectFormat(String input) {
        String regex = "-?\\d+(,\\d+)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
//        return pattern.matcher(input).matches();
    }
}
