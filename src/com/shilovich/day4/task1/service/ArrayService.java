package com.shilovich.day4.task1.service;

import com.shilovich.day4.task1.entity.CustomArray;

public class ArrayService {

    public CustomArray sortBubble(CustomArray array) {
        int size = array.length();
        int[] numberArray = array.getNumberArray();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (numberArray[j + 1] < numberArray[j]) {
                    numberArray[j] += numberArray[j + 1];
                    numberArray[j + 1] = numberArray[j] - numberArray[j + 1];
                    numberArray[j] -= numberArray[j + 1];
                }
            }
        }
        return new CustomArray(numberArray);
    }

    public CustomArray sortBubbleReverse(CustomArray array) {
        int size = array.length();
        int[] numberArray = array.getNumberArray();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (numberArray[j + 1] > numberArray[j]) {
                    numberArray[j] += numberArray[j + 1];
                    numberArray[j + 1] = numberArray[j] - numberArray[j + 1];
                    numberArray[j] -= numberArray[j + 1];
                }
            }
        }
        return new CustomArray(numberArray);
    }

    public CustomArray sortSelection(CustomArray array) {
        int size = array.length();
        int[] numberArray = array.getNumberArray();
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (numberArray[j] < numberArray[minIndex])
                    minIndex = j;
            }
            if (minIndex != i) {
                numberArray[i] += numberArray[minIndex];
                numberArray[minIndex] = numberArray[i] - numberArray[minIndex];
                numberArray[i] -= numberArray[minIndex];
            }
        }
        return new CustomArray(numberArray);
    }

    public CustomArray sortSelectionReverse(CustomArray array) {
        int size = array.length();
        int[] numberArray = array.getNumberArray();
        for (int i = 0; i < size - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (numberArray[j] > numberArray[maxIndex])
                    maxIndex = j;
            }
            if (maxIndex != i) {
                numberArray[i] += numberArray[maxIndex];
                numberArray[maxIndex] = numberArray[i] - numberArray[maxIndex];
                numberArray[i] -= numberArray[maxIndex];
            }
        }
        return new CustomArray(numberArray);
    }

    public CustomArray sortInsertion(CustomArray array) {
        int size = array.length();
        int[] numberArray = array.getNumberArray();
        for (int i = 1; i < size; i++) {
            int key = numberArray[i];
            int j = i - 1;
            while (j >= 0 && numberArray[j] > key) {
                numberArray[j + 1] = numberArray[j];
                j = j - 1;
            }
            numberArray[j + 1] = key;
        }
        return new CustomArray(numberArray);
    }

    public CustomArray sortInsertionReverse(CustomArray array) {
        int size = array.length();
        int[] numberArray = array.getNumberArray();
        for (int i = 1; i < size; i++) {
            int key = numberArray[i];
            int j = i - 1;
            while (j >= 0 && numberArray[j] < key) {
                numberArray[j + 1] = numberArray[j];
                j = j - 1;
            }
            numberArray[j + 1] = key;
        }
        return new CustomArray(numberArray);
    }

    public int binarySearch(int[] sortedArray, int value, int lowIndex, int highIndex) {
        int middle = lowIndex + (highIndex - lowIndex) / 2;
        if (highIndex < lowIndex) {
            return -1;
        }
        if (value == sortedArray[middle]) {
            return middle;
        } else if (value < sortedArray[middle]) {
            return binarySearch(sortedArray, value, lowIndex, middle - 1);
        } else {
            return binarySearch(sortedArray, value, middle + 1, highIndex);
        }
    }

    public int minElement(CustomArray array) {
        int size = array.length();
        int[] numberArray = array.getNumberArray();
        int minElement = numberArray[0];
        for (int i = 1; i < size; i++) {
            if (numberArray[i] < minElement) {
                minElement = numberArray[i];
            }
        }
        return minElement;
    }

    public int maxElement(CustomArray array) {
        int size = array.length();
        int[] numberArray = array.getNumberArray();
        int maxElement = numberArray[0];
        for (int i = 1; i < size; i++) {
            if (numberArray[i] > maxElement) {
                maxElement = numberArray[i];
            }
        }
        return maxElement;
    }

    public int[] findPrimeNumber(CustomArray array) {
        int[] numberArray = array.getNumberArray();
        int size = array.length();
        int count = 0;
        for (int i = 0; i < size; i++) {
            int value = numberArray[i];
            if (value > 1) {
                int j = 2;
                while (value > j) {
                    if (value % j == 0) {
                        count++;
                        break;
                    }
                    j++;
                }
            }
        }
        int length = size - count;
        if (length == 0) {
            return new int[0];
        }
        count = 0;
        int[] result = new int[length];
        for (int i = 0; i < size; i++) {
            int value = numberArray[i];
            if (value == 1) {
                result[count] = value;
                count++;
            } else if (value > 1) {
                int j = 2;
                while (value > j) {
                    if (value % j == 0) {
                        break;
                    }
                    j++;
                }
            } else if (true) {
                result[i] = value;
            }
        }
        return result;
    }
}