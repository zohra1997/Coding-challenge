package ca.jrvs.challenge;

import org.junit.Test;
import static ca.jrvs.challenge.MissingNumber.missingNumber;
import static org.junit.Assert.*;

public class MissingNumberTest {

    @Test
    public void missingNumberTest() {
        assertEquals( missingNumber(new int[]{3, 0, 1}),2);
        assertEquals( missingNumber(new int[]{9,6,4,2,3,5,7,0,1}),8);
    }

}