package maxIaskoTest;

import maxIasko.CountSheepNotSleep;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountSheepNotSleepTest {

    @Test
    public void testSomething() {
        assertEquals("", CountSheepNotSleep.countingSheep(0));
        assertEquals("1 sheep...", CountSheepNotSleep.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", CountSheepNotSleep.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", CountSheepNotSleep.countingSheep(3));
    }
}

