package com.shilovich.day4.task1.main;

import com.shilovich.day4.task1.entity.CustomArray;
import com.shilovich.day4.task1.service.ArrayService;

public class Main {
    public static void main(String[] args) {
        ArrayService service = new ArrayService();
        CustomArray array = new CustomArray(new int[]{7, 2, 4, 1, 5, 9, 13, 17});
        int[] primeNumber = service.findPrimeNumber(array);
        for (int i = 0; i < primeNumber.length; i++) {
            System.out.println(primeNumber[i]);
        }
    }
}
