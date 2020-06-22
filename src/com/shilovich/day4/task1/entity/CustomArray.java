package com.shilovich.day4.task1.entity;

public class CustomArray {
    private int[] numberArray;

    // FIXME: 22.06.2020
    public CustomArray() {
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

    public int[] getNumberArray() {
        return numberArray;
    }

    public void setNumberArray(int[] numberArray) {
        this.numberArray = numberArray;
    }

    public int length() {
        return numberArray.length;
    }

    public boolean isIndexCorrect(int index) {
        return index >= 0 && index < length();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArray array1 = (CustomArray) o;

        if (numberArray == array1.numberArray)
            return true;
        if (numberArray == null || array1.numberArray == null)
            return false;

        if (array1.length() != this.length())
            return false;

        for (int i = 0; i < this.length(); i++)
            if (numberArray[i] != array1.numberArray[i])
                return false;

        return true;
    }

    @Override
    public int hashCode() {
        if (numberArray == null)
            return 0;

        int result = 1;
        for (int element : numberArray)
            result = 31 * result + element;

        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomArray{");
        sb.append("numberArray=");

        if (numberArray == null)
            return "null";
        // FIXME: 21.06.2020
        int iMax = length() - 1;
        if (iMax == -1)
            return "[]";

        sb.append('[');
        for (int i = 0; ; i++) {
            sb.append(numberArray[i]);
            if (i == iMax)
                return sb.append(']').append('}').toString();
            sb.append(", ");
        }
    }
}
