package test.shilovich.day4_2.service;

import com.shilovich.day4_2.enums.SortEnum;
import com.shilovich.day4_2.service.JaggedArrayService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class JaggedArrayServiceTest {

    JaggedArrayService service;
    int[][] jaggedArray;

    @BeforeClass
    public void setUp() {
        service = new JaggedArrayService();
        jaggedArray = new int[][]{{1, 2, 3, 4}, {10, 20}, {5}};
    }

    @Test
    public void testSortBubblePositive() {
        int[][] actual = service.sortBubble(jaggedArray, SortEnum.BY_SUM);
        int[][] expected = {{5}, {1, 2, 3, 4}, {10, 20}};
        assertEquals(actual, expected);
    }

    @Test
    public void testSortBubbleNegative() {
        int[][] actual = service.sortBubble(jaggedArray, SortEnum.BY_SUM);
        int[][] expected = {{1, 2, 3, 4}, {5}, {10, 20}};
        assertNotEquals(actual, expected);
    }
}
