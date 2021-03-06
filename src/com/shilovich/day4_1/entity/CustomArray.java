package com.shilovich.day4_1.entity;

public class CustomArray {
    private int[] numberArray;

    public CustomArray() {
        this.numberArray = new int[0];
    }

    public CustomArray(int[] array) {
        this.numberArray = array;
    }

    public CustomArray(int size) {
        this.numberArray = new int[size];
    }

    public int get(int index) {
        int result = -1;
        if (isIndexCorrect(index)) {
            result = numberArray[index];
        }
        return result;
    }

    public boolean set(int index, int value) {
        boolean result = false;
        if (isIndexCorrect(index)) {
            numberArray[index] = value;
            result = true;
        }
        return result;
    }

    public void setNumberArray(int[] numberArray) {
        this.numberArray = numberArray;
    }

    public int length() {
        return numberArray.length;
    }

    private boolean isIndexCorrect(int index) {
        return index >= 0 && index < length();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomArray array1 = (CustomArray) o;
        if (numberArray == null || array1.numberArray == null) {
            return false;
        }
        if (array1.length() != this.length()) {
            return false;
        }
        for (int i = 0; i < this.length(); i++)
            if (numberArray[i] != array1.numberArray[i]) {
                return false;
            }
        return true;
    }

    @Override
    public int hashCode() {
        if (numberArray == null) {
            return 0;
        }
        int result = 1;
        for (int element : numberArray) {
            result = 31 * result + element;
        }
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomArray{");
        sb.append("numberArray=");
        if (numberArray == null) {
            return "null";
        }
        int iMax = length() - 1;
        if (iMax == -1) {
            return "CustomArray{[]}";
        }
        sb.append('[');
        for (int i = 0; ; i++) {
            sb.append(numberArray[i]);
            if (i == iMax) {
                return sb.append(']').append('}').toString();
            }
            sb.append(", ");
        }
    }
}
