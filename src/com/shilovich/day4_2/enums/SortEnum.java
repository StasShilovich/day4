package com.shilovich.day4_2.enums;

public enum SortEnum {
    BY_SUM {
        @Override
        public boolean sort(int[] arrayA, int[] arrayB) {
            int sumA = calculateArraySum(arrayA);
            int sumB = calculateArraySum(arrayB);
            return sumA < sumB;
        }
    },
    BY_SUM_REVERSE {
        @Override
        public boolean sort(int[] arrayA, int[] arrayB) {
            int sumA = calculateArraySum(arrayA);
            int sumB = calculateArraySum(arrayB);
            return sumA > sumB;
        }
    },
    BY_MAX {
        @Override
        public boolean sort(int[] arrayA, int[] arrayB) {
            int maxA = calculateMaxElement(arrayA);
            int maxB = calculateMaxElement(arrayB);
            return maxA < maxB;
        }
    },
    BY_MAX_REVERSE {
        @Override
        public boolean sort(int[] arrayA, int[] arrayB) {
            int sumA = calculateMaxElement(arrayA);
            int sumB = calculateMaxElement(arrayB);
            return sumA > sumB;
        }
    },
    BY_MIN {
        @Override
        public boolean sort(int[] arrayA, int[] arrayB) {
            int minA = calculateMinElement(arrayA);
            int minB = calculateMinElement(arrayB);
            return minA < minB;
        }
    },
    BY_MIN_REVERSE {
        @Override
        public boolean sort(int[] arrayA, int[] arrayB) {
            int minA = calculateMinElement(arrayA);
            int minB = calculateMinElement(arrayB);
            return minA > minB;
        }
    };

    public abstract boolean sort(int[] arrayA, int[] arrayB);

    private static int calculateMaxElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    private static int calculateMinElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    private static int calculateArraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
