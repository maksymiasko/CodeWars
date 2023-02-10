package nataliiaOliverTest;

import nataliiaOliver.HW10_2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW10_2Test {

    /*
    HW10_2_1 StringToLetters
     */

    @Test
    public void testStringToLetters_HappyPath() {

        String str = "123$%gh  rt9 0";
        String expectedResult = "ghrt";

        HW10_2 sl = new HW10_2();
        String actualResult = sl.StringToLetters(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringToLetters_Null() {

        String str = null;
        String expectedResult = "";

        HW10_2 sl = new HW10_2();
        String actualResult = sl.StringToLetters(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringToLetters_IsEmpty() {

        String str = "";
        String expectedResult = "";

        HW10_2 sl = new HW10_2();
        String actualResult = sl.StringToLetters(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringToLetters_BorderLetters() {

        String str1 = Character.toString('A' - 1); //ASCII 64 = @
        String expectedResult1 = "";

        String str2 = Character.toString('Z' + 1); //ASCII 91 = [
        String expectedResult2 = "";

        String str3 = Character.toString('a' - 1); //ASCII 97 = `
        String expectedResult3 = "";

        String str4 = Character.toString('z' + 1); //ASCII 123 = {
        String expectedResult4 = "";

        HW10_2 sl = new HW10_2();

        String actualResult1 = sl.StringToLetters(str1);
        String actualResult2 = sl.StringToLetters(str2);
        String actualResult3 = sl.StringToLetters(str3);
        String actualResult4 = sl.StringToLetters(str4);

        Assert.assertEquals(actualResult1, expectedResult1);
        Assert.assertEquals(actualResult2, expectedResult2);
        Assert.assertEquals(actualResult3, expectedResult3);
        Assert.assertEquals(actualResult4, expectedResult4);
    }

    /*
    HW10_2_2 StringToLettersAndSpaces
     */

    @Test
    public void testStringToLettersAndSpaces_HappyPath() {

        String str = "123$%gh  rt9 0";
        String expectedResult = "gh  rt ";

        HW10_2 ls = new HW10_2();
        String actualResult = ls.StringToLettersAndSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringToLettersAndSpaces_Null() {

        String str = null;
        String expectedResult = "";

        HW10_2 ls = new HW10_2();
        String actualResult = ls.StringToLettersAndSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringToLettersAndSpaces_IsEmpty() {

        String str = "";
        String expectedResult = "";

        HW10_2 ls = new HW10_2();
        String actualResult = ls.StringToLettersAndSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringToLettersAndSpaces_BorderLetters() {

        String str1 = Character.toString('A' - 1); //ASCII 64 = @
        String expectedResult1 = "";

        String str2 = Character.toString('Z' + 1); //ASCII 91 = [
        String expectedResult2 = "";

        String str3 = Character.toString('a' - 1); //ASCII 97 = `
        String expectedResult3 = "";

        String str4 = Character.toString('z' + 1); //ASCII 123 = {
        String expectedResult4 = "";

        HW10_2 ls = new HW10_2();

        String actualResult1 = ls.StringToLettersAndSpaces(str1);
        String actualResult2 = ls.StringToLettersAndSpaces(str2);
        String actualResult3 = ls.StringToLettersAndSpaces(str3);
        String actualResult4 = ls.StringToLettersAndSpaces(str4);

        Assert.assertEquals(actualResult1, expectedResult1);
        Assert.assertEquals(actualResult2, expectedResult2);
        Assert.assertEquals(actualResult3, expectedResult3);
        Assert.assertEquals(actualResult4, expectedResult4);
    }

    /*
    HW10_2_3 StingToNumbers
     */

    @Test
    public void testStringToNumbers_HappyPath() {

        String str = "123$%gh  rt9 0";
        String expectedResult = "12390";

        HW10_2 sn = new HW10_2();
        String actualResult_V1 = sn.StringToNumbers_V1(str);
        String actualResult_V2 = sn.StringToNumbers_V2(str);

        Assert.assertEquals(actualResult_V1, expectedResult);
        Assert.assertEquals(actualResult_V2, expectedResult);
    }

    @Test
    public void testStringToNumbers_Null() {

        String str = null;
        String expectedResult = "";

        HW10_2 sn = new HW10_2();
        String actualResult_V1 = sn.StringToNumbers_V1(str);
        String actualResult_V2 = sn.StringToNumbers_V2(str);

        Assert.assertEquals(actualResult_V1, expectedResult);
        Assert.assertEquals(actualResult_V2, expectedResult);
    }

    @Test
    public void testStringToNumbers_IsEmpty() {

        String str = "";
        String expectedResult = "";

        HW10_2 sn = new HW10_2();
        String actualResult_V1 = sn.StringToNumbers_V1(str);
        String actualResult_V2 = sn.StringToNumbers_V2(str);

        Assert.assertEquals(actualResult_V1, expectedResult);
        Assert.assertEquals(actualResult_V2, expectedResult);
    }

    @Test
    public void testStringToNumbers_BorderNumberZero() {

        String str = "0";
        String expectedResult = "0";

        HW10_2 sn = new HW10_2();
        String actualResult_V1 = sn.StringToNumbers_V1(str);
        String actualResult_V2 = sn.StringToNumbers_V2(str);

        Assert.assertEquals(actualResult_V1, expectedResult);
        Assert.assertEquals(actualResult_V2, expectedResult);
    }

    @Test
    public void testStringToNumbers_BorderNumberNine() {

        String str = "9";
        String expectedResult = "9";

        HW10_2 sn = new HW10_2();
        String actualResult_V1 = sn.StringToNumbers_V1(str);
        String actualResult_V2 = sn.StringToNumbers_V2(str);

        Assert.assertEquals(actualResult_V1, expectedResult);
        Assert.assertEquals(actualResult_V2, expectedResult);
    }

    /*
    HW10_2_4 StingToNumbersAndSpaces
     */

    @Test
    public void testStringToNumbersAndSpaces_HappyPath() {

        String str = "123$%gh  rt9 0";
        String expectedResult = "123  9 0";

        HW10_2 ns = new HW10_2();
        String actualResult_V1 = ns.StringToNumbersAndSpaces_V1(str);
        String actualResult_V2 = ns.StringToNumbersAndSpaces_V2(str);

        Assert.assertEquals(actualResult_V1, expectedResult);
        Assert.assertEquals(actualResult_V2, expectedResult);
    }

    @Test
    public void testStringToNumbersAndSpaces_Null() {

        String str = null;
        String expectedResult = "";

        HW10_2 ns = new HW10_2();
        String actualResult_V1 = ns.StringToNumbersAndSpaces_V1(str);
        String actualResult_V2 = ns.StringToNumbersAndSpaces_V2(str);

        Assert.assertEquals(actualResult_V1, expectedResult);
        Assert.assertEquals(actualResult_V2, expectedResult);
    }

    @Test
    public void testStringToNumbersAndSpaces_IsEmpty() {

        String str = "";
        String expectedResult = "";

        HW10_2 ns = new HW10_2();
        String actualResult_V1 = ns.StringToNumbersAndSpaces_V1(str);
        String actualResult_V2 = ns.StringToNumbersAndSpaces_V2(str);

        Assert.assertEquals(actualResult_V1, expectedResult);
        Assert.assertEquals(actualResult_V2, expectedResult);
    }

    @Test
    public void testStringToNumbersAndSpaces_BorderNumberZero() {

        String str = "0";
        String expectedResult = "0";

        HW10_2 ns = new HW10_2();
        String actualResult_V1 = ns.StringToNumbersAndSpaces_V1(str);
        String actualResult_V2 = ns.StringToNumbersAndSpaces_V2(str);

        Assert.assertEquals(actualResult_V1, expectedResult);
        Assert.assertEquals(actualResult_V2, expectedResult);
    }

    @Test
    public void testStringToNumbersAndSpaces_BorderNumberNine() {

        String str = "9";
        String expectedResult = "9";

        HW10_2 ns = new HW10_2();
        String actualResult_V1 = ns.StringToNumbersAndSpaces_V1(str);
        String actualResult_V2 = ns.StringToNumbersAndSpaces_V2(str);

        Assert.assertEquals(actualResult_V1, expectedResult);
        Assert.assertEquals(actualResult_V2, expectedResult);
    }
}
