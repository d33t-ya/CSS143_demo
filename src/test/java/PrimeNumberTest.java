import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrimeNumberTest {
    @Test
    public void myAwesomeTest() {
        // TODO: add your test

        //inputs: number
        int input = 2;

        //expected output:
        boolean expect = true;

        //actual output:
        boolean actual = IsAPrimeNumber.isAPrimeNumber(input);

        //is expected the same as usual
        assertEquals(expect, actual);



    }
}
