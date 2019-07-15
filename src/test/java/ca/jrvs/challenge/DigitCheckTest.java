package ca.jrvs.challenge;

import org.junit.Test;

import static ca.jrvs.challenge.DigitCheck.DigitsOnly;
import static org.junit.Assert.*;

public class DigitCheckTest {

    @Test
    public void digitsOnly() {
        assertEquals(true, DigitsOnly("123344521"));
        assertEquals(false, DigitsOnly("123344daf521"));
    }
}