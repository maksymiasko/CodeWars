package nataliiaOliverTest;

import nataliiaOliver.HW10_1;
import org.junit.Assert;
import org.testng.annotations.Test;

public class HW10_1Test {

    @Test
    public void testStringToNumbers_HappyPath() {

        String str = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        HW10_1 sn = new HW10_1();
        int[] actualResult = sn.stringToNumbers(str);

        Assert.assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringToNumbers_Null() {

        String str = null;
        int[] expectedResult = {};

        HW10_1 sn = new HW10_1();
        int[] actualResult = sn.stringToNumbers(str);

        Assert.assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringToNumbers_IsEmpty() {

        String str = " ";
        int[] expectedResult = {};

        HW10_1 sn = new HW10_1();
        int[] actualResult = sn.stringToNumbers(str);

        Assert.assertArrayEquals(actualResult, expectedResult);
    }
}
