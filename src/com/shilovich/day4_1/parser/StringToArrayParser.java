package com.shilovich.day4_1.parser;

import com.shilovich.day4_1.entity.CustomArray;
import com.shilovich.day4_1.exception.NotValidArrayException;

public class StringToArrayParser {
    public CustomArray parseToCustomArray(String string) throws NotValidArrayException {
        String[] split = string.trim().split("\\W+");
        int[] array = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            if (!split[i].matches("\\d+")) {
                throw new NotValidArrayException("Incorrect array value");
            }
            if (!split[i].isEmpty()) {
                array[i] = Integer.parseInt(split[i]);
            }
        }
        return new CustomArray(array);
    }
}
