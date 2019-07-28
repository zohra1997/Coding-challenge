package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfTwoTest {

    @Test
    public void powerOfTwo() {
        assertEquals(PowerOfTwo.powerOfTwo(16),true);
        assertEquals(PowerOfTwo.isPower(19), false);
    }
}