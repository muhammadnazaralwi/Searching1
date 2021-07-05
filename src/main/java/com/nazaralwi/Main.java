package com.nazaralwi;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[] data = {2, 6, 4, 2, 7, 10, 4, 55, 192};
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(2);
        list.add(7);
        list.add(10);
        list.add(4);
        list.add(55);
        list.add(192);

        System.out.println("Linked List");
        bubbleSort(list);
        System.out.println(Arrays.toString(list.toArray()));

        System.out.println("\nArray");
        System.out.println(Arrays.toString(bubbleSort(data)));
        System.out.println(Arrays.toString(selectionSort(data)));
        System.out.println(Arrays.toString(insertionSort(data)));
    }

    private static LinkedList<Integer> bubbleSort(LinkedList<Integer> data) {
        int temp;
        for (int i = 1; i < data.size(); i++) {
            for (int j = data.size() - 1; j >= i ; j--) {
                if (data.get(j) < data.get(j - 1)) {
                    temp = data.get(j);
                    data.set(j, data.get(j - 1));
                    data.set(j - 1, temp);
                }
            }
        }
        return data;
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
            data[j] = temp;
        }
        return data;
    }
}
