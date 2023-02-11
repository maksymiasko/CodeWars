package anastasiayyTest;
import static org.junit.Assert.*;

import anastasiayy.SmashWords;
import org.junit.Test;

public class SmashWordsTest {

    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", SmashWords.smash(new String[] { "Bilal", "Djaghout" }));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", SmashWords.smash(new String[] {}));
    }


    @Test
    public void validateOneWord() {
        assertEquals("Bilal", SmashWords.smash(new String[] {"Bilal"}));
    }

}
