package natalliaOwlTest;

import natalliaOwl.StringToNumbers_1;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class StringToNumbers_1Test {

    // С форматированием
    @Test
    public void testConvertStringToNumbers_HappyPath() {

        String str = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new StringToNumbers_1().convertStringToNumbers(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testConvertStringToNumbers_NegativeNumbers() {

        String str = "5, -10, 7, -3, 12";
        int[] expectedResult = {5, -10, 7, -3, 12};

        int[] actualResult = new StringToNumbers_1().convertStringToNumbers(str);


        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testConvertStringToNumbers_EmptyValue() {

        String str = " ";
        int[] expectedResult = {};

        int[] actualResult = new StringToNumbers_1().convertStringToNumbers(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Без форматирования
    @Test
    public void testConvertStringToNumbers_2_HappyPath() {

        String str = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new StringToNumbers_1().convertStringToNumbers_2(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testConvertStringToNumbers_2_NegativeNumbers() {

        String str = "1, 2, -3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new StringToNumbers_1().convertStringToNumbers_2(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testConvertStringToNumbers_2_WithLetters() {

        String str = "1, A, 5, b, 8";
        int[] expectedResult = {1, 5, 8};

        int[] actualResult = new StringToNumbers_1().convertStringToNumbers_2(str);

        System.out.println(Arrays.toString(actualResult));
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testConvertStringToNumbers_2_EmptyValue() {

        String str = " ";
        int[] expectedResult = {};

        int[] actualResult = new StringToNumbers_1().convertStringToNumbers_2(str);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
