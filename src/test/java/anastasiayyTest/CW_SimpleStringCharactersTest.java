package anastasiayyTest;

import anastasiayy.CW_SimpleStringCharacters;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CW_SimpleStringCharactersTest {
    @Test
    public void testSomething() {
        assertArrayEquals(new int[]{1, 18, 3, 2}, CW_SimpleStringCharacters.Solve("Codewars@codewars123.com"));
        assertArrayEquals(new int[]{8, 6, 3, 2}, CW_SimpleStringCharacters.Solve("CbgA5<1d-tOwUZTS8yQ"));
        assertArrayEquals(new int[]{9, 9, 6, 9}, CW_SimpleStringCharacters.Solve("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H"));
        assertArrayEquals(new int[]{15, 8, 6, 9}, CW_SimpleStringCharacters.Solve("RYT'>s&gO-.CM9AKeH?,5317tWGpS<*x2ukXZD"));
        assertArrayEquals(new int[]{10, 7, 3, 6}, CW_SimpleStringCharacters.Solve("$Cnl)Sr<7bBW-&qLHI!mY41ODe"));
        assertArrayEquals(new int[]{7, 13, 4, 10}, CW_SimpleStringCharacters.Solve("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft"));
    }
}
