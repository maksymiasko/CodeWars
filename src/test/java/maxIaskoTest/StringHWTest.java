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
    public static final String EXPECTED_STRING4 = "AAAA";
    public static final String TEST_STRING8 = "3, 2, 3, 4, 5, 6, 7, 8, 9, 1, 8, 2, 1";
    public static final String TEST_STRING9 = "B, c, D, A, a, J, k, i, D, F, e, r, Z";
    public static final String TEST_STRING10 = "A2B2D4D6F8";

    @Test
    public void stringToNumbersTest1() {
        Assert.assertEquals(Arrays.toString(StringHW.stringToNumbers1(TEST_STRING)), Arrays.toString(EXPECTED_ARRAY));
        Assert.assertEquals(Arrays.toString(StringHW.stringToNumbers1(TEST_EMPTY_STRING)),
                Arrays.toString(EXPECTED_EMPTY_ARRAY));
    }

    @Test
    public void stringToNumbersTest2() {
        Assert.assertEquals(Arrays.toString(StringHW.stringToNumbers2(TEST_STRING)), Arrays.toString(EXPECTED_ARRAY));
        Assert.assertEquals(Arrays.toString(StringHW.stringToNumbers1(TEST_EMPTY_STRING)),
                Arrays.toString(EXPECTED_EMPTY_ARRAY));
    }

    @Test
    public void stringToLettersTest() {
        Assert.assertEquals(TEST_EMPTY_STRING, StringHW.stringToLetters(TEST_STRING));
        Assert.assertEquals(EXPECTED_STRING1, StringHW.stringToLetters(TEST_STRING1));
        Assert.assertEquals(TEST_EMPTY_STRING, StringHW.stringToLetters(TEST_EMPTY_STRING));
    }

    @Test
    public void stringToLettersAndSpacesTest() {
        Assert.assertEquals("    ", StringHW.stringToLettersAndSpaces(TEST_STRING));
        Assert.assertEquals(EXPECTED_STRING2, StringHW.stringToLettersAndSpaces(TEST_STRING1));
        Assert.assertEquals(TEST_EMPTY_STRING, StringHW.stringToLetters(TEST_EMPTY_STRING));
        Assert.assertEquals(TEST_SPACE_STRING, StringHW.stringToLettersAndSpaces(TEST_SPACE_STRING));
    }

    @Test
    public void stringToNumbersAndSpacesTest() {
        Assert.assertEquals(EXPECTED_STRING3, StringHW.stringToNumbersAndSpaces(TEST_STRING1));
        Assert.assertEquals(TEST_EMPTY_STRING, StringHW.stringToNumbersAndSpaces(TEST_EMPTY_STRING));
        Assert.assertEquals(TEST_SPACE_STRING, StringHW.stringToNumbersAndSpaces(TEST_SPACE_STRING));
        Assert.assertEquals(EXPECTED_STRING3, StringHW.stringToNumbersAndSpaces(EXPECTED_STRING3));
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

    @Test
    public void repeatCharactersTest() {
        Assert.assertEquals(TEST_EMPTY_STRING, StringHW.repeatCharacters(TEST_EMPTY_STRING));
        Assert.assertEquals(EXPECTED_STRING4, StringHW.repeatCharacters(TEST_STRING1));
        Assert.assertEquals(TEST_EMPTY_STRING, StringHW.repeatCharacters(TEST_STRING7));
        Assert.assertEquals(EXPECTED_ABC_STRING + EXPECTED_ABC_STRING,
                StringHW.repeatCharacters(EXPECTED_ABC_REPEAT_STRING));
    }

    @Test
    public void digitsAndLettersTest() {
        Assert.assertEquals(TEST_STRING10, StringHW.digitsAndLetters(TEST_STRING8, TEST_STRING9));
        Assert.assertEquals(10, StringHW.digitsAndLetters(TEST_STRING8, TEST_STRING9).length());
        Assert.assertEquals(TEST_EMPTY_STRING, StringHW.digitsAndLetters(TEST_STRING, TEST_STRING9));
        Assert.assertEquals(TEST_EMPTY_STRING, StringHW.digitsAndLetters(TEST_STRING7, EXPECTED_ABC_STRING));
    }
}
