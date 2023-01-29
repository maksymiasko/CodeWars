package verafesTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import verafes.StringMethods2;

import java.util.Arrays;

public class StringMethods2Test {

    /* 1. stringToNumbersArray algorithms
     * 1.1. positive and negative one-digits numbers in string */
    @Test
    public void test_StringOfNumbersToArray_HappyPath() {
        String str = "1, 2, -3, 4, 5";
        int[] expectedResult = {1, 2, -3, 4, 5};

        int[] actualResult = new StringMethods2().stringToNumbersArray(str);

        System.out.println("exp: " + Arrays.toString(expectedResult));
        System.out.println("act: " + Arrays.toString(actualResult));

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 1.1. positive and negative one-digits numbers in string with char-algo
    @Test
    public void test_StringOfNumsToArray_HappyPath() {
        String str = "1, 2, -3, 4, 5";
        int[] expectedResult = {1, 2, -3, 4, 5};

        int[] actualResult = new StringMethods2().stringToNumsArray(str);

        System.out.println("exp: " + Arrays.toString(expectedResult));
        System.out.println("act: " + Arrays.toString(actualResult));

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 1.2. positive and negative multi-digits numbers in string
    @Test
    public void test_StringOfNumbersToArray2_HappyPath() {
        String str = "1, 12, 367, -42, 5";
        int[] expectedResult = {1, 12, 367, -42, 5};

        int[] actualResult = new StringMethods2().stringToNumbersArray(str);

        Assert.assertEquals(actualResult, expectedResult);
    }


    // 2. Negative testing
    // Empty String
    @Test
    public void testEmptyString_Negative() {
        String str = "";
        int[] expectedResult = {-1};

        int[] actualResult = new StringMethods2().stringToNumbersArray(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Blank String
    @Test
    public void testOneWhiteSpaceString_Negative() {
        String str = " ";
        int[] expectedResult = {-1};

        int[] actualResult = new StringMethods2().stringToNumbersArray(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // string with positive and negative numbers and words
    @Test
    public void test_StringOfCharsAndNumbersToArray_() {
        String str = "1, word3, c, -55, 340";
        int[] expectedResult = {1, 0, 0, -55, 340};

        int[] actualResult = new StringMethods2().stringToNumbersArray(str);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
