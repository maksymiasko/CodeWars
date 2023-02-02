package AnzhelikaBaaTest;

import AnzhelikaBaa.StringHw;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringHwTest {

    @Test
    public void test_StringOfNumbersToArray_HappyPath() {
        String a = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = new StringHw().stringToNumbers(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_StringOfNumbersToArray2_HappyPath() {
        String a = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = new StringHw().stringToNumbers2(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_StringOfNegativeNumbersToArray_HappyPath() {
        String a = "-1, -2, -3, -4, -5";
        int[] expectedResult = {-1, -2, -3, -4, -5};
        int[] actualResult = new StringHw().stringToNumbers(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_emptyStringToArray_Negative() {
        String a = "";
        int[] expectedResult = {};
        int[] actualResult = new StringHw().stringToNumbers(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_emptyStringToArray2_Negative() {
        String a = "";
        int[] expectedResult = {};
        int[] actualResult = new StringHw().stringToNumbers2(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_oneWhiteSpaceStringToArray_Negative() {
        String a = " ";
        int[] expectedResult = {};
        int[] actualResult = new StringHw().stringToNumbers(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_oneWhiteSpaceStringToArray2_Negative() {
        String a = " ";
        int[] expectedResult = {};
        int[] actualResult = new StringHw().stringToNumbers2(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /** /** Написать 4 алгоритма StringToLetters, StringToLettersAndSpaces, StringToNumbers,
     * StringToNumbersAndSpaces*/

    @Test
    public void test_StringToLetters_HappyPath() {
        String str = "ghjkjhgjkRTYUTRYTR567865678@@@)))";
        String expectedResult = "ghjkjhgjkRTYUTRYTR";

        String actualResult = new StringHw().StringToLetters(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_emptyString_HappyPath() {
        String str = "";
        String expectedResult = "";

        String actualResult = new StringHw().StringToLetters(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_stringWithNoLetters_HappyPath() {
        String str = "1232123&*()*&";
        String expectedResult = "";

        String actualResult = new StringHw().StringToLetters(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_getLettersWithSpaces_HappyPath() {
        String str = "dfgh 12&A B";
        String expectedResult = "dfgh A B";

        String actualResult = new StringHw().StringToLettersAndSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_emptyString2_HappyPath() {
        String str = "";
        String expectedResult = "";

        String actualResult = new StringHw().StringToLettersAndSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }
}