package com.shilovich.day4_1.service;

import com.shilovich.day4_1.entity.CustomArray;

public class CustomArraySearchService {

    private static final int FIBONACCI_MAX_ELEMENT_IN_INT = 46;

    public int binarySearch(CustomArray array, int value, int lowIndex, int highIndex) {
        int middle = lowIndex + (highIndex - lowIndex) / 2;
        if (highIndex < lowIndex) {
            return -1;
        }
        if (value == array.get(middle)) {
            return middle;
        } else if (value < array.get(middle)) {
            return binarySearch(array, value, lowIndex, middle - 1);
        } else {
            return binarySearch(array, value, middle + 1, highIndex);
        }
    }

    public int minElement(CustomArray array) {
        int size = array.length();
        int minElement = array.get(0);
        for (int i = 1; i < size; i++) {
            if (array.get(i) < minElement) {
                minElement = array.get(i);
            }
        }
        return minElement;
    }

    public int maxElement(CustomArray array) {
        int size = array.length();
        int maxElement = array.get(0);
        for (int i = 1; i < size; i++) {
            if (array.get(i) > maxElement) {
                maxElement = array.get(i);
            }
        }
        return maxElement;
    }

    public CustomArray findPrimeNumbers(CustomArray array) {
        int size = array.length();
        CustomArray numberArray = new CustomArray(size);
        int count = 0;
        for (int i = 0; i < size; i++) {
            boolean isPrime = true;
            int value = array.get(i);
            int j = 1;
            while (value / 2 > j++) {
                if (value % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                numberArray.set(count, array.get(i));
                count++;
            }
        }
        CustomArray result = new CustomArray(count);
        for (int i = 0; i < count; i++) {
            result.set(i, numberArray.get(i));
        }
        return result;
    }

    public CustomArray findFibonacciNumbers(CustomArray array) {
        int size = array.length();
        CustomArray numbers = new CustomArray(size);
        int index = 0;
        for (int i = 0; i < size; i++) {
            int value = array.get(i);
            if (isFibonacci(value)) {
                numbers.set(index, array.get(i));
                index++;
            }
        }
        CustomArray result = new CustomArray(index);
        for (int i = 0; i < index; i++) {
            result.set(i, numbers.get(i));
        }
        return result;
    }

    private boolean isFibonacci(int value) {
        int fibonacciPrevious = 0;
        int fibonacciCurrent = 1;
        if (value == fibonacciPrevious) {
            return true;
        }
        if (value == fibonacciCurrent) {
            return true;
        }
        int fibonacciNext = fibonacciPrevious + fibonacciCurrent;
        int count = 0;
        int sum;
        while (value >= fibonacciNext && count <= FIBONACCI_MAX_ELEMENT_IN_INT) {
            if (value == fibonacciNext) {
                return true;
            }
            sum = fibonacciCurrent;
            fibonacciCurrent = fibonacciNext;
            fibonacciNext += sum;
        }
        return false;
    }
}
