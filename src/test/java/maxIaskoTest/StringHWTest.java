package maxIaskoTest;

import maxIasko.StringHW;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class StringHWTest {

    public static final String TEST_STRING = "1, 2, 3, 4, 5";
    public static final String TEST_STRING1 = "1, 2, 3, 4, 5, 10, A, B, c, d, +, ";
    public static final String TEST_EMPTY_STRING = "";
    public static final String TEST_SPACE_STRING = " ";
    public static final int[] EXPECTED_ARRAY = {1, 2, 3, 4, 5};
    public static final int[] EXPECTED_EMPTY_ARRAY = {};
    public static final String EXPECTED_STRING1 = "ABcd";
    public static final String EXPECTED_STRING2 = "      A B c d  ";
    public static final String EXPECTED_STRING3 = "1 2 3 4 5 10      ";

    @Test
    public void stringToNumbersTest1() {
        Assert.assertTrue(Arrays.toString(StringHW.stringToNumbers1(TEST_STRING))
                .contentEquals(Arrays.toString(EXPECTED_ARRAY)));
        Assert.assertTrue(Arrays.toString(StringHW.stringToNumbers1(TEST_EMPTY_STRING))
                .contentEquals(Arrays.toString(EXPECTED_EMPTY_ARRAY)));
    }

    @Test
    public void stringToNumbersTest2() {
        Assert.assertTrue(Arrays.toString(StringHW.stringToNumbers2(TEST_STRING))
                .contentEquals(Arrays.toString(EXPECTED_ARRAY)));
        Assert.assertTrue(Arrays.toString(StringHW.stringToNumbers1(TEST_EMPTY_STRING))
                .contentEquals(Arrays.toString(EXPECTED_EMPTY_ARRAY)));
    }

    @Test
    public void stringToLettersTest() {
        Assert.assertTrue(StringHW.stringToLetters(TEST_STRING).contentEquals(TEST_EMPTY_STRING));
        Assert.assertTrue(StringHW.stringToLetters(TEST_STRING1).contentEquals(EXPECTED_STRING1));
        Assert.assertTrue(StringHW.stringToLetters(TEST_EMPTY_STRING).contentEquals(TEST_EMPTY_STRING));
    }

    @Test
    public void stringToLettersAndSpacesTest() {
        Assert.assertTrue(StringHW.stringToLettersAndSpaces(TEST_STRING).contentEquals("    "));
        Assert.assertEquals(EXPECTED_STRING2, StringHW.stringToLettersAndSpaces(TEST_STRING1));
        Assert.assertTrue(StringHW.stringToLetters(TEST_EMPTY_STRING).contentEquals(TEST_EMPTY_STRING));
        Assert.assertEquals(TEST_SPACE_STRING, StringHW.stringToLettersAndSpaces(TEST_SPACE_STRING));
    }

    @Test
    public void stringToNumbersAndSpacesTest() {
        Assert.assertTrue(StringHW.stringToNumbersAndSpaces(TEST_STRING1).contentEquals(EXPECTED_STRING3));
        Assert.assertTrue(StringHW.stringToNumbersAndSpaces(TEST_EMPTY_STRING).contentEquals(TEST_EMPTY_STRING));
        Assert.assertTrue(StringHW.stringToNumbersAndSpaces(TEST_SPACE_STRING).contentEquals(TEST_SPACE_STRING));
        Assert.assertTrue(StringHW.stringToNumbersAndSpaces(EXPECTED_STRING3).contentEquals(EXPECTED_STRING3));
    }
}
