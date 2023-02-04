package natalliaOwlTest;

import natalliaOwl.StringsHW10_1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringsHW10_1Test {

    @Test
    public void testConvertStringToNumbers_HappyPath() {

        String str = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new StringsHW10_1().convertStringToNumbers(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testConvertStringToNumbers_Happy_Path() {

        String str = "1, 32, 3, -4, 5";
        int[] expectedResult = {1, 32, 3, -4, 5};

        int[] actualResult = new StringsHW10_1().convertStringToNumbers(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testConvertStringToNumbers_Negative() {

        String str = " ";
        int[] expectedResult = {};

        int[] actualResult = new StringsHW10_1().convertStringToNumbers(str);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
