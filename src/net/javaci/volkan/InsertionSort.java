package net.javaci.volkan;

import java.util.Arrays;

public class InsertionSort {
    static int[] array = new int[6];

    public static void main(String[] args) {

        array[0] = 5;
        array[1] = 9;
        array[2] = 3;
        array[3] = 7;
        array[4] = 4;
        array[5] = 2;


        int min;
        int index;
        for (int i = 0; i < array.length; i++)
        {
            min = array[i];
            index = i;
            for (int j = i; j < array.length; j++)
            {
                if (array[j] < min)
                {
                    min = array[j];
                    index = j;
                }
            }

            array[index] = array[i];
            array[i] = min;
        }

        System.out.println(Arrays.toString(array));
    }



}