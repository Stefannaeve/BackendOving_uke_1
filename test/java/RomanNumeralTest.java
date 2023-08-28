import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RomanNumeralTest {
    //Henrik, Pårse sug
    @Test
    public void testOneReturnsI(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals(romanNumerals.numerals(1), "i");
    }
}
