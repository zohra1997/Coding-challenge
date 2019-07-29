package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountPrimesTest {

    @Test
    public void countPrimes() {
        assertEquals(CountPrimes.countPrimes(12), 5);
    }
}