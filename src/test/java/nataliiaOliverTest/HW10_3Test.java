package nataliiaOliverTest;

import nataliiaOliver.HW10_3;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW10_3Test {

    @Test
    public void testStringWordRepeatNTimes_HappyPath() {

        String str = "abc";
        int n = 5;
        String expectedResult = "abc, abc, abc, abc, abc, 19";

        HW10_3 rn = new HW10_3();
        String actualResult = rn.stringRepeatNTimes(str, n);

        System.out.println(actualResult);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringNumberRepeatNTimes_HappyPath() {

        String str = "25";
        int n = 3;
        String expectedResult = "25, 25, 25, 8";

        String actualResult = new HW10_3().stringRepeatNTimes(str, n);

        System.out.println(actualResult);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringNumberWordSymbolRepeatNTimes_HappyPath() {

        String str = "1 & two";
        int n = 2;
        String expectedResult = "1 & two, 1 & two, 11";

        String actualResult = new HW10_3().stringRepeatNTimes(str, n);

        System.out.println(actualResult);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringRepeatNTimes_Null() {

        String str = null;
        int n = 2;
        String expectedResult = "";

        String actualResult = new HW10_3().stringRepeatNTimes(str, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringRepeatNTimes_IsEmpty() {

        String str = " ";
        int n = 2;
        String expectedResult = "";

        String actualResult = new HW10_3().stringRepeatNTimes(str, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringRepeatNTimes_NegativeNumber() {

        String str = "abc";
        int n = -5;
        String expectedResult = "";

        String actualResult = new HW10_3().stringRepeatNTimes(str, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringRepeatNTimes_NumberIsZero() {

        String str = "abc";
        int n = 0;
        String expectedResult = "";

        String actualResult = new HW10_3().stringRepeatNTimes(str, n);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
