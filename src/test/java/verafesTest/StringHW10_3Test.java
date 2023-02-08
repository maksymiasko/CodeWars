package verafesTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import verafes.StringHW10_3;
import verafes.StringMethods2;

import java.util.Arrays;

public class StringHW10_3Test {

    /* 3. method that returns string argument n times
     * 3.1. positive and negative one-digits numbers in string */
    @Test
    public void test_oneWordString_HappyPath() {
        String str = "abc";
        int n = 5;
        String expectedResult = "abc, abc, abc, abc, abc, 19";

        String actualResult = new StringHW10_3().StringNTimes(str, n);

        System.out.println("act: " + actualResult);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_oneSymbolString_HappyPath() {
        String str = "1";
        int n = 7;
        String expectedResult = "1, 1, 1, 1, 1, 1, 1, 13";

        String actualResult = new StringHW10_3().StringNTimes(str, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_twoWordString_HappyPath() {
        String str = "abc xyz";
        int n = 3;
        String expectedResult = "abc xyz, abc xyz, abc xyz, 20";

        String actualResult = new StringHW10_3().StringNTimes(str, n);

        System.out.println("act: " + actualResult);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 3.2. Negative testing
    // Empty String
    @Test
    public void testEmptyString_Negative() {
        String str = "";
        int n = 5;
        String expectedResult = "String is empty or blank";

        String actualResult = new StringHW10_3().StringNTimes(str, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Blank String
    @Test
    public void testOneWhiteSpaceString_Negative() {
        String str = " ";
        int n = 5;
        String expectedResult = "String is empty or blank";

        String actualResult = new StringHW10_3().StringNTimes(str, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // not empty string, negative number
    @Test
    public void test_StringOfCharsAndNumbersToArray_() {
        String str = "word";
        int n = 0;
        String expectedResult = "Number cannot be 0 or negative";

        String actualResult = new StringHW10_3().StringNTimes(str, n);
        System.out.println("act: " + actualResult);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
