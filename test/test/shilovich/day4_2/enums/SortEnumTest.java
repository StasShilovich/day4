package test.shilovich.day4_2.enums;

import com.shilovich.day4_2.enums.SortEnum;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SortEnumTest {

    int[] arrayA;
    int[] arrayB;

    @BeforeClass
    public void setUp() {
        arrayA = new int[]{3, 9, 7};
        arrayB = new int[]{2, 1, 6};
    }

    @Test
    public void testBySumSortEnumPositive() {
        boolean condition = SortEnum.BY_SUM.sort(arrayB, arrayA);
        assertTrue(condition);
    }

    @Test
    public void testBySumSortEnumNegative() {
        boolean condition = SortEnum.BY_SUM.sort(arrayA, arrayB);
        assertFalse(condition);
    }

    @Test
    public void testBySumReverseSortEnumPositive() {
        boolean condition = SortEnum.BY_SUM_REVERSE.sort(arrayA, arrayB);
        assertTrue(condition);
    }

    @Test
    public void testBySumReverseSortEnumNegative() {
        boolean condition = SortEnum.BY_SUM_REVERSE.sort(arrayB, arrayA);
        assertFalse(condition);
    }

    @Test
    public void testByMaxSortEnumPositive() {
        boolean condition = SortEnum.BY_MAX.sort(arrayB, arrayA);
        assertTrue(condition);
    }

    @Test
    public void testByMaxSortEnumNegative() {
        boolean condition = SortEnum.BY_MAX.sort(arrayA, arrayB);
        assertFalse(condition);
    }

    @Test
    public void testByMaxReverseSortEnumPositive() {
        boolean condition = SortEnum.BY_MAX_REVERSE.sort(arrayA, arrayB);
        assertTrue(condition);
    }

    @Test
    public void testByMaxReverseSortEnumNegative() {
        boolean condition = SortEnum.BY_MAX_REVERSE.sort(arrayB, arrayA);
        assertFalse(condition);
    }

    @Test
    public void testByMinSortEnumPositive() {
        boolean condition = SortEnum.BY_MIN.sort(arrayB, arrayA);
        assertTrue(condition);
    }

    @Test
    public void testByMinSortEnumNegative() {
        boolean condition = SortEnum.BY_MIN.sort(arrayA, arrayB);
        assertFalse(condition);
    }

    @Test
    public void testByMinReverseSortEnumPositive() {
        boolean condition = SortEnum.BY_MIN_REVERSE.sort(arrayA, arrayB);
        assertTrue(condition);
    }

    @Test
    public void testByMinReverseSortEnumNegative() {
        boolean condition = SortEnum.BY_MIN_REVERSE.sort(arrayB, arrayA);
        assertFalse(condition);
    }
}
