package verafesTest;

import org.junit.Assert;
import org.junit.Test;
import verafes.QuarterOfTheYear;

public class QuarterOfTheYearTest {

    @Test
    public void testQuarterOfTheYear() {
        int month = (int) (Math.random() * (12 - 1)) + 1;
        int actual = QuarterOfTheYear.quarterOf(month);

        System.out.println(month + ", " + actual);

        Assert.assertEquals(1, QuarterOfTheYear.quarterOf(1));
        Assert.assertEquals(1, QuarterOfTheYear.quarterOf(2));
        Assert.assertEquals(1, QuarterOfTheYear.quarterOf(3));
        Assert.assertEquals(2, QuarterOfTheYear.quarterOf(4));
        Assert.assertEquals(2, QuarterOfTheYear.quarterOf(5));
        Assert.assertEquals(2, QuarterOfTheYear.quarterOf(6));
        Assert.assertEquals(3, QuarterOfTheYear.quarterOf(7));
        Assert.assertEquals(3, QuarterOfTheYear.quarterOf(8));
        Assert.assertEquals(3, QuarterOfTheYear.quarterOf(9));
        Assert.assertEquals(4, QuarterOfTheYear.quarterOf(10));
        Assert.assertEquals(4, QuarterOfTheYear.quarterOf(11));
        Assert.assertEquals(4, QuarterOfTheYear.quarterOf(12));
    }
}
