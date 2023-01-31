package verafesTest;

import static org.junit.Assert.*;
import org.junit.Test;

import verafes.GoodVsEvil;

public class GoodVsEvilTest {

    @Test
    public void testEvilWin() {
        assertEquals("Evil should win", "Battle Result: Evil eradicates all trace of Good",
                GoodVsEvil.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
    }

    @Test
    public void testGoodWin() {
        assertEquals("Good should win", "Battle Result: Good triumphs over Evil",
                GoodVsEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
    }

    @Test
    public void testTie() {
        assertEquals("Should be a tie", "Battle Result: No victor on this battle field",
                GoodVsEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
    }

    @Test
    public void testBigIntsEvilWin() {
        assertEquals("Evil should win", "Battle Result: Evil eradicates all trace of Good",
                GoodVsEvil.battle("2530 351 3314 1049 9215 1201", "3105 8581 9178 1907 8960 4080 8101"));
    }

    @Test
    public void testBigIntsGoodWin() {
        assertEquals("Good should win", "Battle Result: Good triumphs over Evil",
                GoodVsEvil.battle("933 5573 5264 8714 4839 8278", "4978 1032 9330 8608 748 3616 6249"));
    }
}
