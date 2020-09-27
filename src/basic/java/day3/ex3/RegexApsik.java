package basic.java.day3.ex3;

import java.util.regex.Pattern;

public class RegexApsik {
    public static void main(String[] args) {
        System.out.println(isThereAnyA("a psik"));
        System.out.println(isThereAnyA("psik"));
        System.out.println(isThereAnyA(" psik"));
        System.out.println(isThereAnyA("aaaa Psik"));
        System.out.println(isThereAnyA("aapsik"));
        System.out.println(isThereAnyA("aaaaaa psik"));
    }

    private static boolean isThereAnyA(String input) {
        String regex = "a+ ([pP])sik";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input).matches();
    }
}
