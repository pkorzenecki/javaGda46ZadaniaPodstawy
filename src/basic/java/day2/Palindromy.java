package basic.java.day2;

public class Palindromy {

    public static void main(String[] args) {
        System.out.println(ifPalindrome("kajak"));
        System.out.println(ifPalindrome("dom"));

    }

    private static boolean ifPalindrome(String input) {
        StringBuilder sb = new StringBuilder(input);

        return sb.reverse().toString().equals(input);

    }
}
