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

    // 1.1. positive one-digits numbers in string with char-algo
    @Test
    public void test_StringOfNumsToArray_HappyPath() {
        String str = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

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

    /* 2. Four algorithms to filter Letters, LettersAndSpaces, Numbers, NumbersAndSpaces
        Positive: Happy path
     2.1. algorithm filters Letters (and deletes any other symbol) */
    @Test
    public void test_getOnlyLetters_HappyPath() {
        String str = "Testing a #String with 1,-2,35, and 4 special @#$ chars";
        String expectedResult = "TestingaStringwithandspecialchars";

        String actualResult = new StringMethods2().StringToLetters(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_getOnlyLetters_ifNoLettersInNotEmptyString_Positive() {
        String str = "#1,-2, 35, &4!";
        String expectedResult = "";

        String actualResult = new StringMethods2().StringToLetters(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //2.2. algorithm filters Letters with spaces
    @Test
    public void test_getLettersWithSpaces_HappyPath() {
        String str = "Testing a #String with 1,-2, 35, and 4 special @#$ chars";
        String expectedResult = "Testing a String with   and  special  chars";

        String actualResult = new StringMethods2().StringToLettersWithSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_getLettersAndSpaces_ifNoLettersNoSpacesInNotEmptyString_Positive() {
        String str = "#1,-2,35,&4!";
        String expectedResult = "";

        String actualResult = new StringMethods2().StringToLetters(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //2.3. algorithm filters digits, no spaces, letters, and no special chars
    @Test
    public void test_StringToNumbers_HappyPath() {
        String str = "Testing a #String with 1,-2,35, and 4 special @#$ chars";
        String expectedResult = "12354";

        String actualResult = new StringMethods2().StringToNumbers(str);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void test_gettingOnlyDigits_ifNoDigitsInNotEmptyString_Positive() {
        String str = "Testing a #String with commas, & four special $_chars!";
        String expectedResult = "";

        String actualResult = new StringMethods2().StringToNumbers(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //2.4. algorithm filters digits with spaces
    @Test
    public void test_StringToNumbersWithSpaces_HappyPath() {
        String str = "Testing a #String with 1,-2, 35, and 4 special @#$ chars";
        String expectedResult = "    12 35  4   ";

        String actualResult = new StringMethods2().StringToNumbersWithSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_getDigitsAndSpaces_ifNoDigitsNoSpacesInNotEmptyString_Positive() {
        String str = "Testing#String!with^commas,&someSpecial$_chars!";
        String expectedResult = "";

        String actualResult = new StringMethods2().StringToNumbersWithSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Negative tests
    @Test
    public void test_emptyString_Negative() {
        String str = "";
        String expectedResult = "String is empty";

        String actualResult = new StringMethods2().StringToLetters(str);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
