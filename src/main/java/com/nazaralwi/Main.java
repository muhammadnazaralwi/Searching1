package com.nazaralwi;

public class Main {
    public static void main(String[] args) {

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
}
