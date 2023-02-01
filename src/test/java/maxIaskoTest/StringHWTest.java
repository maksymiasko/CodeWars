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
    public static final String EXPECTED_ABC_STRING = "abc";
    public static final int EXPECTED_LENGTH = 19;
    public static final String EXPECTED_ABC_REPEAT_STRING = "abc, abc, abc, abc, abc";
    public static final String TEST_STRING4 = "1";
    public static final String TEST_STRING5 = "1.1";
    public static final String TEST_STRING6 = "a";
    public static final String TEST_STRING7 = "0123456789";

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

    @Test
    public void stringNTimesTest() {
        Assert.assertEquals(EXPECTED_LENGTH, StringHW.stringNTimes(EXPECTED_ABC_STRING, 5)
                .trim().replace(TEST_SPACE_STRING, TEST_EMPTY_STRING).length());
        Assert.assertEquals(EXPECTED_ABC_REPEAT_STRING, StringHW.stringNTimes(EXPECTED_ABC_STRING, 5));
        Assert.assertEquals(TEST_EMPTY_STRING, StringHW.stringNTimes(TEST_EMPTY_STRING, 5));
    }

    @Test
    public void isNaturalNumberTest() {
        Assert.assertFalse(StringHW.isNaturalNumber(TEST_EMPTY_STRING));
        Assert.assertFalse(StringHW.isNaturalNumber(TEST_SPACE_STRING));
        Assert.assertTrue(StringHW.isNaturalNumber(TEST_STRING4));
        Assert.assertFalse(StringHW.isNaturalNumber(TEST_STRING5));
        Assert.assertFalse(StringHW.isNaturalNumber(TEST_STRING6));
        Assert.assertFalse(StringHW.isNaturalNumber(TEST_STRING7));
    }
}
