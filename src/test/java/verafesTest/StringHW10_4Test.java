package verafesTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import verafes.StringHW10_4;

public class StringHW10_4Test {
     /* 4. Algorithm checks if the passed string is a natural number.
      * 4.1. Positive tests.
      * true natural number: “1” → true
      *          System.out.println("act: " + actualResult);
      * */
     @Test
     public void test_trueNaturalNumberString_HappyPath() {
         String str = "1";
         boolean expectedResult = true;

         boolean actualResult = new StringHW10_4().isNaturalNumber(str);

         Assert.assertEquals(actualResult, expectedResult);
     }

    /* multiply-digits string: “123456789” → false */
    @Test
    public void test_multiplyDigitsString_Positive() {
        String str = "123456789";
        boolean expectedResult = true;

        boolean actualResult = new StringHW10_4().isNaturalNumber(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /* 4.2. Negative tests.
    * float number string: “1.1” → false */
    @Test
    public void test_floatNumberString_Negative() {
        String str = "1.1";
        boolean expectedResult = false;

        boolean actualResult = new StringHW10_4().isNaturalNumber(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /* one letter string: “a” → false */
    @Test
    public void test_oneCharString_Negative() {
        String str = "a";
        boolean expectedResult = false;

        boolean actualResult = new StringHW10_4().isNaturalNumber(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /* String is mix of letters and digit: “5a” → false */
    @Test
    public void test_mixLettersAndDigitString_Negative() {
        String str = "5a";
        boolean expectedResult = false;

        boolean actualResult = new StringHW10_4().isNaturalNumber(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /* string of single zero digit: “0” → false */
    @Test
    public void test_ZeroNumberString_HappyPath() {
        String str = "0";
        boolean expectedResult = false;

        boolean actualResult = new StringHW10_4().isNaturalNumber(str);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /* multiply-digits string starts with "0": “0123456789” → false */
    @Test
    public void test_multiplyDigitsString_Negative() {
        String str = "0123456789";
        boolean expectedResult = false;

        boolean actualResult = new StringHW10_4().isNaturalNumber(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /* empty string: “” → false */
    @Test
    public void test_emptyString_Negative() {
        String str = "";
        boolean expectedResult = false;

        boolean actualResult = new StringHW10_4().isNaturalNumber(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /* null string: null → false */
    @Test
    public void test_nullString_Negative() {
        String str = null;
        boolean expectedResult = false;

        boolean actualResult = new StringHW10_4().isNaturalNumber(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /* blank string: “ ” → false */
    @Test
    public void test_blankString_Negative() {
        String str = " ";
        boolean expectedResult = false;

        boolean actualResult = new StringHW10_4().isNaturalNumber(str);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
