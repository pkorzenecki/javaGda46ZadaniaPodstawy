package basic.java.day2;

public class UpperAndLowerCases {
    //żeby unikać magic numbers warto określić stałe przed metodami

    private static final int VALUE_OF_START_LOWERCASE_ASCII = 65;
    private static final int VALUE_OF_END_LOWERCASE_ASCII = 90;
    private static final int VALUE_OF_START_UPPERCASE_ASCII = 97;
    private static final int VALUE_OF_END_UPPERCASE_ASCII = 122;

    public static void main(String[] args) {


        System.out.println(replaceChars("Ala ma kota!"));

    }

    private static String replaceChars(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            if (character >= VALUE_OF_START_LOWERCASE_ASCII && character <= VALUE_OF_END_LOWERCASE_ASCII) {
                result.append((char) (character + 32));
            } else if (character >= VALUE_OF_START_UPPERCASE_ASCII && character <= VALUE_OF_END_UPPERCASE_ASCII) {
                result.append((char) (character - 32));
            } else {
                result.append(character);
            }
        }
        return result.toString();

    }
}
