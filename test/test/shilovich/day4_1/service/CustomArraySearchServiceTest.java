package test.shilovich.day4_1.service;

import com.shilovich.day4_1.entity.CustomArray;
import com.shilovich.day4_1.service.CustomArraySearchService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class CustomArraySearchServiceTest {

    CustomArraySearchService service;
    CustomArray array;
    CustomArray threeDigitArray;

    @BeforeClass
    public void setUp() {
        service = new CustomArraySearchService();
        int[] numberArray = new int[]{5, 3, 6, 9, 1, 3};
        array = new CustomArray(numberArray);
        int[] threeDigitNumberArray = new int[]{455, 781, 2, 387, 999, 100, 123};
        threeDigitArray = new CustomArray(threeDigitNumberArray);
    }

    @Test
    public void testBinarySearchPositive() {
        int actual = service.binarySearch(array, 6, 0, array.length() - 1);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test(dependsOnMethods = "testBinarySearchPositive")
    public void testBinarySearchNegative() {
        int actual = service.binarySearch(array, 6, 0, array.length() - 1);
        int expected = 0;
        assertNotEquals(actual, expected);
    }

    @Test
    public void testBinarySearchIndexFail() {
        int actual = service.binarySearch(array, 6, array.length() - 1, 0);
        int expected = -1;
        assertEquals(actual, expected);
    }

    @Test
    public void testMaxElementPositive() {
        int actual = service.maxElement(array);
        int expected = 9;
        assertEquals(actual, expected);
    }

    @Test(dependsOnMethods = "testMaxElementPositive")
    public void testMaxElementNegative() {
        int actual = service.maxElement(array);
        int expected = 7;
        assertNotEquals(actual, expected);
    }

    @Test
    public void testMinElementPositive() {
        int actual = service.minElement(array);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test(dependsOnMethods = "testMinElementPositive")
    public void testMinElementNegative() {
        int actual = service.minElement(array);
        int expected = 2;
        assertNotEquals(actual, expected);
    }

    @Test
    public void testFindingPrimeNumberPositive() {
        CustomArray actual = service.findPrimeNumbers(array);
        CustomArray expected = new CustomArray(new int[]{5, 3, 1, 3});
        assertEquals(actual, expected);
    }

    @Test(dependsOnMethods = "testFindingPrimeNumberPositive")
    public void testFindingPrimeNumberNegative() {
        CustomArray actual = service.findPrimeNumbers(array);
        CustomArray expected = new CustomArray(new int[]{5, 3, 1, 3, 0});
        assertNotEquals(actual, expected);
    }

    @Test
    public void testFindingFibonacciNumbersPositive() {
        CustomArray actual = service.findFibonacciNumbers(array);
        CustomArray expected = new CustomArray(new int[]{5, 3, 1, 3});
        assertEquals(actual, expected);
    }

    @Test(dependsOnMethods = "testFindingFibonacciNumbersPositive")
    public void testFindingFibonacciNumbersNegative() {
        CustomArray actual = service.findFibonacciNumbers(array);
        CustomArray expected = new CustomArray(new int[]{5, 3, 1, 3, 9});
        assertNotEquals(actual, expected);
    }

    @Test
    public void testFindingNumbersWithUniqueDigitsPositive() {
        CustomArray actual = service.findNumbersWithUniqueDigits(threeDigitArray);
        CustomArray expected = new CustomArray(new int[]{781, 387, 123});
        assertEquals(actual, expected);
    }

    @Test(dependsOnMethods = "testFindingNumbersWithUniqueDigitsPositive")
    public void testFindingNumbersWithUniqueDigitsNegative() {
        CustomArray actual = service.findNumbersWithUniqueDigits(threeDigitArray);
        CustomArray expected = new CustomArray(new int[]{781, 387, 100, 123});
        assertNotEquals(actual, expected);
    }
}
