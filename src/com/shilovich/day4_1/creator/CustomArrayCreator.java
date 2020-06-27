package com.shilovich.day4_1.creator;

import com.shilovich.day4_1.entity.CustomArray;
import com.shilovich.day4_1.parser.StringToArrayParser;
import com.shilovich.day4_1.reader.CustomFileReader;

import java.util.Random;
import java.util.Scanner;

public class CustomArrayCreator {

    private final static int INT_BOUND = 999;

    public CustomArray createByRandom(int size) {
        Random random = new Random();
        CustomArray result = new CustomArray(size);
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(INT_BOUND) + 1;
            result.set(i, randomNumber);
        }
        return result;
    }

    public CustomArray createByConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array:");
        String string = "";
        if (scanner.hasNext()) {
            string = scanner.nextLine();
        }
        if (string == "" || string == null) {
            return new CustomArray();
        }
        StringToArrayParser parser = new StringToArrayParser();
        CustomArray customArray = parser.parseToCustomArray(string);
        return customArray;
    }

    public CustomArray createFromFile() {
        CustomFileReader reader = new CustomFileReader();
        StringToArrayParser parser = new StringToArrayParser();
        String file = reader.readFile();
        CustomArray customArray = parser.parseToCustomArray(file);
        return customArray;
    }
}
