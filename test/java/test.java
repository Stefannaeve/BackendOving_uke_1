import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class test {
    //Henrik, Pårse sug
    @Test
    void test(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals(romanNumerals.numerals("iv"), true);
    }
}
