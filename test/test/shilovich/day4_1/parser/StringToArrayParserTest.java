package test.shilovich.day4_1.parser;

import com.shilovich.day4_1.entity.CustomArray;
import com.shilovich.day4_1.exception.NotValidArrayException;
import com.shilovich.day4_1.parser.StringToArrayParser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class StringToArrayParserTest {

    String correctArray;
    String incorrectArray;
    StringToArrayParser parser;

    @BeforeClass
    public void setUp() {
        correctArray = "110,2.6/19 8-35,14";
        incorrectArray = "10<232>23, 232q";
        parser = new StringToArrayParser();
    }

    @Test
    public void testParserToCustomArrayPositive() throws NotValidArrayException {
        CustomArray actual = parser.parseToCustomArray(correctArray);
        CustomArray expected = new CustomArray(new int[]{110, 2, 6, 19, 8, 35, 14});
        assertEquals(actual, expected);
    }

    @Test(dependsOnMethods = "testParserToCustomArrayPositive")
    public void testParserToCustomArrayNegative() throws NotValidArrayException {
        CustomArray actual = parser.parseToCustomArray(correctArray);
        CustomArray expected = new CustomArray(new int[]{110, 2, 6, 19, 8, 35});
        assertNotEquals(actual, expected);
    }

    @Test(expectedExceptions = NotValidArrayException.class)
    public void testStringToArrayParserException() throws NotValidArrayException {
        parser.parseToCustomArray(incorrectArray);
    }
}
