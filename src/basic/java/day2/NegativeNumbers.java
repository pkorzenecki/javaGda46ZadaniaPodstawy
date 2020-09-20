package basic.java.day2;

import java.util.Arrays;

public class NegativeNumbers {
    public static void main(String[] args) {
        int[] array = {12, -7, 19, -5};
        int lenght = howMuchNegative(array);
        int[] arrayOfNegs = new int[lenght];

        System.out.println(Arrays.toString(arrayWithNegNumbers(lenght, arrayOfNegs)));
    }

    private static int[] arrayWithNegNumbers(int length, int[] arr) {
        int[] newArray = new int[length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                newArray[counter] = arr[i];
            }

        }
        return newArray;
    }

    private static int howMuchNegative(int[] arr) {

        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count++;
            }
        }
        return count;
    }
}
//TODO - przejrzeć ten kod. Nie pokazuje w nowej tabeli tych liczb, które chciałem - czyli ujemnych
