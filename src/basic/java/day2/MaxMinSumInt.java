package basic.java.day2;

import java.util.Arrays;

public class MaxMinSumInt {
    public static void main(String[] args) {
        int[] array = {12, 7, 19};

        System.out.println("Minimalna wartość to: " + findMinValue(array));
        System.out.println("Maksymalna wartość to: " + findMaxValue(array));
        System.out.println("Suma to: " + findSumValue(array));
    }


    private static int findMinValue(int[] arr) {
        int minVal = arr[0];
        for (int j : arr) {
            if (j < minVal) minVal = j;
        }
        return minVal;

        //return Arrays.stream(arr).min().getAsInt();
    }

    private static int findMaxValue(int[] arr) {
        int maxVal = arr[0];
        for (int j : arr) {
            if (j > maxVal) maxVal = j;
        }
        return maxVal;

        //return Arrays.stream(arr).max().getAsInt();
    }

    private static int findSumValue(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;

        //return Arrays.stream(arr).sum();

    }


    //alternatywne rozwiązanie
}
