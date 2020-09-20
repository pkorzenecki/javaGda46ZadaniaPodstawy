package basic.java.day2;

public class CountCharInString {
    public static void main(String[] args) {

        System.out.println(counterOfSpecificChars("ala ma kota", 'a'));
    }

    private static int counterOfSpecificChars(String input, char sign) {
        if (input.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == sign) {
                count++;
            }

        }
        return count;
    }
}
