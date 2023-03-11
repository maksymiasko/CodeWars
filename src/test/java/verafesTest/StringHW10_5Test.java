package verafesTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import verafes.StringHW10_4;
import verafes.StringHW10_5;

public class StringHW10_5Test {
    /* task 5. a string made of the last 3 characters and the first 3 characters of the passed string
     or returns a string containing the first char repeated number of chars times
     * 5.1. Positive tests
     * one letter string: str = "a" */
    @Test
    public void test_oneLetterString() {
        String str = "a";
        String expectedResult = "a";

        String actualResult = new StringHW10_5().getLast3First3(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /* more than 5 letter string : str.length() > 5 */
    @Test
    public void test_more5LettersString() {
        String str = "abcdefg";
        String expectedResult = "efgabc";

        String actualResult = new StringHW10_5().getLast3First3(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /*  5 letter string or less : str.length() <= 5*/
    @Test
    public void test_3LettersString() {
        String str = "12345";
        String expectedResult = "11111";

        String actualResult = new StringHW10_5().getLast3First3(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_blankString() {
        String str = "  ";
        String expectedResult = "  ";

        String actualResult = new StringHW10_5().getLast3First3(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /* 5.2. Negative tests
    * null string */
    @Test
    public void test_nullString_Negative() {
        String str = "";
        String expectedResult = "String is null or empty";

        String actualResult = new StringHW10_5().getLast3First3(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /* empty string */
    @Test
    public void test_emptyString_Negative() {
        String str = "";
        String expectedResult = "String is null or empty";

        String actualResult = new StringHW10_5().getLast3First3(str);

        Assert.assertEquals(actualResult, expectedResult);
    }
}