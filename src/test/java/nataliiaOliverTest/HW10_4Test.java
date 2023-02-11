package nataliiaOliverTest;

import nataliiaOliver.HW10_4;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW10_4Test {

    @Test
    public void testPassedStringIsNaturalNumber_HappyPath() {

        String str = "1";
        boolean expectedResult = true;

        boolean actualResult1 = new HW10_4().isNaturalNumber_V1(str);
        boolean actualResult2 = new HW10_4().isNaturalNumber_V2(str);
        boolean actualResult3 = new HW10_4().isNaturalNumber_V3(str);

        Assert.assertEquals(actualResult1, expectedResult);
        Assert.assertEquals(actualResult2, expectedResult);
        Assert.assertEquals(actualResult3, expectedResult);
    }

    @Test
    public void testPassedStringIsMultiValuedNumber() {

        String str = "246813579";
        boolean expectedResult = true;

        boolean actualResult1 = new HW10_4().isNaturalNumber_V1(str);
        boolean actualResult2 = new HW10_4().isNaturalNumber_V2(str);
        boolean actualResult3 = new HW10_4().isNaturalNumber_V3(str);

        Assert.assertEquals(actualResult1, expectedResult);
        Assert.assertEquals(actualResult2, expectedResult);
        Assert.assertEquals(actualResult3, expectedResult);
    }

    @Test
    public void testPassedStringStartsWithZero() {

        String str = "0123456789";
        boolean expectedResult = false;

        boolean actualResult1 = new HW10_4().isNaturalNumber_V1(str);
        boolean actualResult2 = new HW10_4().isNaturalNumber_V2(str);
        boolean actualResult3 = new HW10_4().isNaturalNumber_V3(str);

        Assert.assertEquals(actualResult1, expectedResult);
        Assert.assertEquals(actualResult2, expectedResult);
        Assert.assertEquals(actualResult3, expectedResult);
    }

    @Test
    public void testPassedStringIsFractionalNumber() {

        String str = "1.1";
        boolean expectedResult = false;

        boolean actualResult1 = new HW10_4().isNaturalNumber_V1(str);
        boolean actualResult2 = new HW10_4().isNaturalNumber_V2(str);
        boolean actualResult3 = new HW10_4().isNaturalNumber_V3(str);

        Assert.assertEquals(actualResult1, expectedResult);
        Assert.assertEquals(actualResult2, expectedResult);
        Assert.assertEquals(actualResult3, expectedResult);
    }

    @Test
    public void testPassedStringIsLetter() {

        String str = "a";
        boolean expectedResult = false;

        boolean actualResult1 = new HW10_4().isNaturalNumber_V1(str);
        boolean actualResult2 = new HW10_4().isNaturalNumber_V2(str);
        boolean actualResult3 = new HW10_4().isNaturalNumber_V3(str);

        Assert.assertEquals(actualResult1, expectedResult);
        Assert.assertEquals(actualResult2, expectedResult);
        Assert.assertEquals(actualResult3, expectedResult);
    }

    @Test
    public void testPassedString_MixLettersAndNumbers() {

        String str = "a1B2c3";
        boolean expectedResult = false;

        boolean actualResult1 = new HW10_4().isNaturalNumber_V1(str);
        boolean actualResult2 = new HW10_4().isNaturalNumber_V2(str);
        boolean actualResult3 = new HW10_4().isNaturalNumber_V3(str);

        Assert.assertEquals(actualResult1, expectedResult);
        Assert.assertEquals(actualResult2, expectedResult);
        Assert.assertEquals(actualResult3, expectedResult);
    }

    @Test
    public void testPassedString_Symbols() {

        String str = "%$@!^#*&";
        boolean expectedResult = false;

        boolean actualResult1 = new HW10_4().isNaturalNumber_V1(str);
        boolean actualResult2 = new HW10_4().isNaturalNumber_V2(str);
        boolean actualResult3 = new HW10_4().isNaturalNumber_V3(str);

        Assert.assertEquals(actualResult1, expectedResult);
        Assert.assertEquals(actualResult2, expectedResult);
        Assert.assertEquals(actualResult3, expectedResult);
    }

    @Test
    public void testPassedString_IsEmpty() {

        String str = "";
        boolean expectedResult = false;

        boolean actualResult1 = new HW10_4().isNaturalNumber_V1(str);
        boolean actualResult2 = new HW10_4().isNaturalNumber_V2(str);
        boolean actualResult3 = new HW10_4().isNaturalNumber_V3(str);

        Assert.assertEquals(actualResult1, expectedResult);
        Assert.assertEquals(actualResult2, expectedResult);
        Assert.assertEquals(actualResult3, expectedResult);
    }

    @Test
    public void testPassedString_IsBlank() {

        String str = " ";
        boolean expectedResult = false;

        boolean actualResult1 = new HW10_4().isNaturalNumber_V1(str);
        boolean actualResult2 = new HW10_4().isNaturalNumber_V2(str);
        boolean actualResult3 = new HW10_4().isNaturalNumber_V3(str);

        Assert.assertEquals(actualResult1, expectedResult);
        Assert.assertEquals(actualResult2, expectedResult);
        Assert.assertEquals(actualResult3, expectedResult);
    }

    @Test
    public void testPassedString_IsNull() {

        String str = null;
        boolean expectedResult = false;

        boolean actualResult1 = new HW10_4().isNaturalNumber_V1(str);
        boolean actualResult2 = new HW10_4().isNaturalNumber_V2(str);
        boolean actualResult3 = new HW10_4().isNaturalNumber_V3(str);

        Assert.assertEquals(actualResult1, expectedResult);
        Assert.assertEquals(actualResult2, expectedResult);
        Assert.assertEquals(actualResult3, expectedResult);
    }
}
