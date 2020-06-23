package test.shilovich.day4_1.service;

import com.shilovich.day4_1.entity.CustomArray;
import com.shilovich.day4_1.service.CustomArraySortService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class CustomArraySortServiceTest {

    CustomArraySortService service;
    CustomArray array;
    CustomArray sortedArray;
    CustomArray sortedArrayReverse;

    @BeforeClass
    public void setUp() {
        service = new CustomArraySortService();
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

    @Test(dependsOnMethods = "testBubbleSortPositive")
    public void testBubbleSortNegative() {
        CustomArray actual = service.sortBubble(array);
        CustomArray expected = new CustomArray();
        assertNotEquals(actual, expected);
    }

    @Test
    public void testReverseBubbleSortPositive() {
        CustomArray actual = service.sortBubbleReverse(array);
        CustomArray expected = sortedArrayReverse;
        assertEquals(actual, expected);
    }

    @Test(dependsOnMethods = "testReverseBubbleSortPositive")
    public void testReverseBubbleSortNegative() {
        CustomArray actual = service.sortBubbleReverse(array);
        CustomArray expected = new CustomArray();
        assertNotEquals(actual, expected);
    }

    @Test
    public void testSelectionSortPositive() {
        CustomArray actual = service.sortSelection(array);
        CustomArray expected = sortedArray;
        assertEquals(actual, expected);
    }

    @Test(dependsOnMethods = "testSelectionSortPositive")
    public void testSelectionSortNegative() {
        CustomArray actual = service.sortSelection(array);
        CustomArray expected = new CustomArray();
        assertNotEquals(actual, expected);
    }

    @Test
    public void testReverseSelectionSortPositive() {
        CustomArray actual = service.sortSelectionReverse(array);
        CustomArray expected = sortedArrayReverse;
        assertEquals(actual, expected);
    }

    @Test(dependsOnMethods = "testReverseSelectionSortPositive")
    public void testReverseSelectionSortNegative() {
        CustomArray actual = service.sortSelectionReverse(array);
        CustomArray expected = new CustomArray();
        assertNotEquals(actual, expected);
    }

    @Test
    public void testInsertionSortPositive() {
        CustomArray actual = service.sortInsertion(array);
        CustomArray expected = sortedArray;
        assertEquals(actual, expected);
    }

    @Test(dependsOnMethods = "testInsertionSortPositive")
    public void testInsertionSortNegative() {
        CustomArray actual = service.sortInsertion(array);
        CustomArray expected = new CustomArray();
        assertNotEquals(actual, expected);
    }

    @Test
    public void testReverseInsertionSortPositive() {
        CustomArray actual = service.sortInsertionReverse(array);
        CustomArray expected = sortedArrayReverse;
        assertEquals(actual, expected);
    }

    @Test(dependsOnMethods = "testReverseInsertionSortPositive")
    public void testReverseInsertionSortNegative() {
        CustomArray actual = service.sortInsertionReverse(array);
        CustomArray expected = new CustomArray();
        assertNotEquals(actual, expected);
    }
}
