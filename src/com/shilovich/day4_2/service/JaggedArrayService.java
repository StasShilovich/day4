package com.shilovich.day4_2.service;

import com.shilovich.day4_2.enums.SortEnum;

public class JaggedArrayService {
    public int[][] sortBubble(int[][] array, SortEnum sortEnum) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (sortEnum.sort(array[j + 1], array[j])) {
                    int[] ints = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = ints;
                }
            }
        }
        return array;
    }
}
