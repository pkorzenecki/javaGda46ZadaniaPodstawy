package basic.java.day2;

public class SwapChar {
    public static void main(String[] args) {


        replaceAndPrintString("Ala.ma.kota,");
    }

    private static void replaceAndPrintString(String input) {
        String result = input.replace(",", "-STOP-")
                .replace(".", "-STOP-");
        System.out.println("new tekst: " + result);
    }
}
