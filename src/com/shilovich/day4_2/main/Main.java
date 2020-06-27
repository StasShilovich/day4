package com.shilovich.day4_2.main;

import com.shilovich.day4_2.enums.SortEnum;
import com.shilovich.day4_2.service.JaggedArrayService;

public class Main {
    public static void main(String[] args) {
        JaggedArrayService service = new JaggedArrayService();
        int[][] array = {{1, 2, 3, 4}, {10, 20}, {5}};
        service.sortByRowSum(array, SortEnum.BY_MIN_REVERSE);
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                System.out.println(array[i][i1]);
            }
            System.out.println();
        }
    }
}
