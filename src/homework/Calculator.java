package homework;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj symbol działania: ");
        String operator = sc.nextLine();
        System.out.print("Podaj pierwszą wartość: ");
        float firstValue = sc.nextFloat();
        System.out.print("Podaj drugą wartość: ");
        float secondValue = sc.nextFloat();

        float result;
        switch (operator) {

            case "+":
                result = firstValue + secondValue;
                System.out.println(result);
                break;
            case "-":
                result = firstValue - secondValue;
                System.out.println(result);

                break;
            case "*":
                result = firstValue * secondValue;
                System.out.println(result);

                break;
            case "/":
                result = firstValue / secondValue;
                System.out.println(result);
                break;
            default:
                System.out.println("Wrong operator");
                System.exit(1);
        }

    }

}

