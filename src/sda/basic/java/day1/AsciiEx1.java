package sda.basic.java.day1;

public class AsciiEx1 {
    public static void main(String[] args) {
        
        displayWordInHex();

        System.out.println();

        displayWordInDec();

        System.out.println();

        displayWordInBin();
    }

    private static void displayWordInBin() {
        char s = 0b01010011;
        char d = 0b01000100;
        char a = 0b01000001;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }

    private static void displayWordInDec() {
        char s = 83;
        char d = 68;
        char a = 65;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);

    }

    private static void displayWordInHex() {
        char s = 0x53;
        char d = 0x44;
        char a = 0x41;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }
}
