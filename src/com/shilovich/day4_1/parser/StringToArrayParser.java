package com.shilovich.day4_1.parser;

import com.shilovich.day4_1.entity.CustomArray;

public class StringToArrayParser {
    public CustomArray parseToCustomArray(String string) {
        String[] split = string.trim().split("\\W+");
        int[] array = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            if (!split[i].isEmpty()) {
                array[i] = Integer.parseInt(split[i]);
            }
        }
        return new CustomArray(array);
    }
}
