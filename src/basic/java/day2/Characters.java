package basic.java.day2;

public class Characters {
    public static void main(String[] args) {
        System.out.println(getLastCharacterV1("domek"));

        System.out.println(getLastCharacterV2("domek"));

    }

    private static char getLastCharacterV1(String input) {
        int lastPosition = input.length() -1;
        return input.charAt(lastPosition);

    }

    private static String getLastCharacterV2(String input) {
        int lastPosition = input.length() -1;
        return input.substring(lastPosition);
    }
}
