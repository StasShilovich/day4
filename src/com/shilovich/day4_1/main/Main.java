package com.shilovich.day4_1.main;

import com.shilovich.day4_1.entity.CustomArray;
import com.shilovich.day4_1.service.CustomArraySortService;

public class Main {
    public static void main(String[] args) {
        CustomArraySortService service = new CustomArraySortService();
        CustomArray array = new CustomArray(new int[]{7, 2, 4, 1, 5, 9, 13, 17});
        CustomArray customArray = service.sortBubble(array);
        System.out.println(customArray);
        CustomArray customArray1 = service.sortBubbleReverse(array);
        System.out.println(customArray1);
    }
}
