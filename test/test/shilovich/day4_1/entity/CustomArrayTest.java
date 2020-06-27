package test.shilovich.day4_1.entity;

import com.shilovich.day4_1.entity.CustomArray;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

public class CustomArrayTest {

    CustomArray customArray;

    @BeforeClass
    public void setUp() {
        int[] numberArray = new int[]{5, 3, 6, 9, 1, 3};
        customArray = new CustomArray(numberArray);
    }

    @Test
    public void testGetPositive() {
        int actual = customArray.get(2);
        int expected = 6;
        assertEquals(actual, expected);
    }

    @Test
    public void testGetNegative() {
        int actual = customArray.get(2);
        int expected = 3;
        assertNotEquals(actual, expected);
    }

    @Test
    public void testSetPositive() {
        boolean condition = customArray.set(1, 10);
        assertTrue(condition);
    }

    @Test
    public void testSetNegative() {
        boolean condition = customArray.set(6, 10);
        assertFalse(condition);
    }

    @Test
    public void testLengthPositive() {
        int actual = customArray.length();
        int expected = 6;
        assertEquals(actual, expected);
    }

    @Test
    public void testLengthNegative() {
        int actual = customArray.length();
        int expected = 5;
        assertNotEquals(actual, expected);
    }
}
