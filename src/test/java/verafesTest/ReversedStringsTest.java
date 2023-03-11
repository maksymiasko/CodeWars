package verafesTest;

import org.testng.annotations.Test;
import verafes.GoodVsEvil;
import verafes.ReversedStrings;

import static org.junit.Assert.assertEquals;

public class ReversedStringsTest {

    @Test
    public void testReversedString() {
        assertEquals("dlrow", ReversedStrings.reversedString("world"));
        assertEquals("twcnuyw7", ReversedStrings.reversedString("7wyuncwt"));
        assertEquals("iwxk!4p ", ReversedStrings.reversedString(" p4!kxwi"));
        assertEquals("il pajogwa;7swa7g,29t !ml78yct or8x6wc! ",
                ReversedStrings.reversedString(" !cw6x8ro tcy87lm! t92,g7aws7;awgojap li"));
        assertEquals("@n6ygygjaecnA5uikgnve!3nwk2'ybqqhgnh'!m5 3j3fqw mDamg5%sh /?'mj! 7ma1?ktzpe",
                ReversedStrings.reversedString("epztk?1am7 !jm'?/ hs%5gmaDm wqf3j3 5m!'hnghqqby'2kwn3!evngkiu5Anceajgygy6n@"));

    }
}
