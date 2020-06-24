package com.shilovich.day4_1.creator;

import com.shilovich.day4_1.entity.CustomArray;

import java.util.Scanner;

public class ConsoleCustomArrayCreator {

    public CustomArray createCustomArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array");
        int size = 0;
        if (scanner.hasNext()) {
            size = scanner.nextInt();
        }
        // FIXME: 24.06.2020
        if (size <= 0) {
            return null;
        }
        CustomArray array = new CustomArray(size);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " element");
            int scanNumber = scanner.nextInt();
            array.set(i, scanNumber);
        }
        return array;
    }
}
