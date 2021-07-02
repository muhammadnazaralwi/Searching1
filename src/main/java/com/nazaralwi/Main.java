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
}
