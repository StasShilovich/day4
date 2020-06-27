package com.shilovich.day4_1.service;

import com.shilovich.day4_1.entity.CustomArray;

public class CustomArraySortService {
    public CustomArray sortBubble(CustomArray array) {
        int size = array.length();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array.get(j + 1) < array.get(j)) {
                    array.set(j, array.get(j) + array.get(j + 1));
                    array.set(j + 1, array.get(j) - array.get(j + 1));
                    array.set(j, array.get(j) - array.get(j + 1));
                }
            }
        }
        return array;
    }

    public CustomArray sortBubbleReverse(CustomArray array) {
        sortBubble(array);
        return reverseArray(array);
    }

    public CustomArray sortSelection(CustomArray array) {
        int size = array.length();
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array.get(j) < array.get(minIndex))
                    minIndex = j;
            }
            if (minIndex != i) {
                array.set(i, array.get(i) + array.get(minIndex));
                array.set(minIndex, array.get(i) - array.get(minIndex));
                array.set(i, array.get(i) - array.get(minIndex));
            }
        }
        return array;
    }

    public CustomArray sortSelectionReverse(CustomArray array) {
        sortSelection(array);
        return reverseArray(array);
    }

    public CustomArray sortInsertion(CustomArray array) {
        int size = array.length();
        for (int i = 1; i < size; i++) {
            int key = array.get(i);
            int j = i - 1;
            while (j >= 0 && array.get(j) > key) {
                array.set(j + 1, array.get(j));
                j = j - 1;
            }
            array.set(j + 1, key);
        }
        return array;
    }

    public CustomArray sortInsertionReverse(CustomArray array) {
        sortInsertion(array);
        return reverseArray(array);
    }

    private CustomArray reverseArray(CustomArray array) {
        int size = array.length();
        for (int i = 0; i < size / 2; i++) {
            array.set(i, array.get(i) + array.get(size - 1 - i));
            array.set(size - 1 - i, array.get(i) - array.get(size - 1 - i));
            array.set(i, array.get(i) - array.get(size - 1 - i));
        }
        return array;
    }
}
