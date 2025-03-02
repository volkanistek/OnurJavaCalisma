package net.javaci.volkan;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {4, 9, 1, 0, 13, 7, 9};

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
