package com.shilovich.day4_1.creator;

import com.shilovich.day4_1.entity.CustomArray;

import java.util.Random;

public class RandomCustomArrayCreator {

    private final static int INT_BOUND = 1000;

    public CustomArray createCustomArray(int size) {
        Random random = new Random();
        CustomArray result = new CustomArray(size);
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(INT_BOUND);
            result.set(i, randomNumber);
        }
        return result;
    }
}
