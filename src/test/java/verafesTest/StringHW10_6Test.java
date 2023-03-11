package verafesTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import verafes.StringHW10_5;

import static verafes.StringHW10_6.generateStringOf10DigitsAndLetters;

public class StringHW10_6Test {
    /**
     * Task 6. Write a  method should return a string with a length of 10,
     * on even indexes should be even digits (ascending order)
     * on odd indexes should be letters (ascending order)
     */

    @Test
    public void test_Length() {
        String str = "a";
        String expectedResult = "a";

        String actualResult = new StringHW10_5().getLast3First3(str);

        System.out.println("act: " + actualResult);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGenerateStringOf10DigitsAndLetters() {
        String result = generateStringOf10DigitsAndLetters();

        // getting not null result
        Assert.assertNotNull(result);

        // length of string is 10 symbols
        Assert.assertEquals(10, result.length());

        //uses both uppercase and lowercase letters in a random order from alphabet
        // but maintains the requirement of the letters being in ascending order
        Assert.assertTrue(result.matches("[02468][A-Za-z][02468][A-Za-z][02468][A-Za-z][02468][A-Za-z][02468][A-Za-z]"));
    }
}
