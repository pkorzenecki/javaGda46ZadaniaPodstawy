package basic.java.day2;

import java.util.Arrays;

public class CountingOnTwoDimensionTable {
    public static void main(String[] args) {
        int[][] array = new int[3][10];
        for (int i = 0; i < 10; i++) {
            array[0][i] = i + 1;
            array[1][i] = array[0][i] * array[0][i];
            array[2][i] = array[1][i] * array[0][i];

        }

        for(int[] a : array)
            System.out.println(Arrays.toString(a));
    }
}
