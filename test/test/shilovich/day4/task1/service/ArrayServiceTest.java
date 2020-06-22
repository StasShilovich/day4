package test.shilovich.day4.task1.service;

import com.shilovich.day4.task1.entity.CustomArray;
import com.shilovich.day4.task1.service.ArrayService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayServiceTest {

    ArrayService service;
    CustomArray array;
    CustomArray sortedArray;
    CustomArray sortedArrayReverse;

    @BeforeClass
    public void setUp() {
        service = new ArrayService();
        int[] numberArray = {5, 3, 6, 9, 1, 3};
        array = new CustomArray(numberArray);
        int[] numberSortedArray = {1, 3, 3, 5, 6, 9};
        sortedArray = new CustomArray((numberSortedArray));
        int[] numberSortedArrayReverse = {9, 6, 5, 3, 3, 1};
        sortedArrayReverse = new CustomArray(numberSortedArrayReverse);
    }

    @Test
    public void testBubbleSortPositive() {
        CustomArray actual = service.sortBubble(array);
        CustomArray expected = sortedArray;
        assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSortPositive() {
        CustomArray actual = service.sortInsertion(array);
        CustomArray expected = sortedArray;
        assertEquals(actual, expected);
    }

    @Test
    public void testSelectioSortPositive() {
        CustomArray actual = service.sortSelection(array);
        CustomArray expected = sortedArray;
        assertEquals(actual, expected);
    }


}
