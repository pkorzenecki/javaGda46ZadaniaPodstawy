package sda.basic.java.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diameter {

    final static float PI = 3.14f;

    public static void main(String[] args) {

        float diameter = getDiameterFromUser();

        float circumference = calculateCircumference(diameter);
        System.out.println("Obwód koła wynosi: " + circumference);

        float area = calculateArea(diameter);
        System.out.println("Pole koła wynosi: " + area);


    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość średnicy: ");
        try {
            return scanner.nextFloat();
        } catch (InputMismatchException ex) {
            System.out.println("Złe dane");
            System.exit(1); //kod inny od 0 oznacza błąd
        } finally {
            System.out.println("Ostateczny krok");
        }
        return 0;
    }

    private static float calculateCircumference(float diam) {

        return PI * diam;

    }

    private static float calculateArea(float diam) {

        return (PI * (float) (Math.pow(diam / 2, 2)));
    }
}
