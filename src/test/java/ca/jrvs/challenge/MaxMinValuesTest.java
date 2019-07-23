package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxMinValuesTest {

    @Test
    public void function() {
        String expected = MaxMinValues.function(new int [] {1,9,8,17,6,12 ,8,90});
        String Actual = "MIN: 1 MAX: 90";
        assertEquals(expected,Actual);
    }
}