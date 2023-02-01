package alexanderChgTest;

import alexandrChg.BeginnerSeries2Clock;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BeginnerSeries2ClockTest {

        @Test
        public void test1(){

            assertEquals(61000, BeginnerSeries2Clock.Past(0,1,1));
        }
}
