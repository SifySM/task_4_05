package edu.vsu.ru;

import java.util.Comparator;

public class SortArray {

    private static  <T> void sort(T[] data, Comparator<T> c, boolean[] fixed) {
        int size = data.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j >= i; j--) {
                int k = 1;
                while (!fixed[j]) {
                    j--;
                    k = 1;
                }
                if (j == 0) k = 0;
                while (!fixed[j - k]) {
                    k++;
                    if ((j - k < i) && (i <= 0)) return;
                }
                if (c.compare(data[j - k], data[j]) > 0) {  // data[j - 1] > data[j]

                    T tmp = data[j - k];
                    data[j - k] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void sort(T[] data, boolean[] fixed){
        sort(data, Comparable::compareTo, fixed);
    }
}
