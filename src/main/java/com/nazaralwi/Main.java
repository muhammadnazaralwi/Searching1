package com.nazaralwi;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = {2, 6, 4, 2, 7, 10, 4, 55, 192};
        System.out.println(Arrays.toString(bubbleSort(data)));
        System.out.println(Arrays.toString(selectionSort(data)));
        System.out.println(Arrays.toString(insertionSort(data)));
    }

    private static int[] bubbleSort(int[] data) {
        int temp;
        for (int i = 1; i < data.length; i++) {
            for (int j = data.length - 1; j >= i ; j--) {
                if (data[j] < data[j-1]) {
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
        return data;
    }

    private static int[] selectionSort(int[] data) {
        int pos, temp;
        for (int i = 0; i < data.length; i++) {
            pos = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[pos]) {
                    pos = j;
                }
            }

            if (pos != i) {
                temp = data[pos];
                data[pos] = data[i];
                data[i] = temp;
            }
        }

        return data;
    }

    private static int[] insertionSort(int[] data) {
        int temp, j;
        for (int i = 0; i < data.length; i++) {
            temp = data[i];
            j = i;
            while ((j > 0) && (data[j-1] > temp)) {
                data[j] = data[j-1];
                j--;
            }
        }
        return data;
    }
}
