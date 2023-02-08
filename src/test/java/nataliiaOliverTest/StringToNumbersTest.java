package nataliiaOliverTest;

import nataliiaOliver.StringToNumbers;
import org.junit.Assert;
import org.testng.annotations.Test;

public class StringToNumbersTest {

    @Test
    public void testStringToNumbersHappyPath() {

        String str = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers sn = new StringToNumbers();
        int[] actualResult = sn.stringToNumbers(str);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersNull() {

        String str = null;
        int[] expectedResult = {};

        StringToNumbers sn = new StringToNumbers();
        int[] actualResult = sn.stringToNumbers(str);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersIsEmpty() {

        String str = " ";
        int[] expectedResult = {};

        StringToNumbers sn = new StringToNumbers();
        int[] actualResult = sn.stringToNumbers(str);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
