package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateNumberTest {

    @Test
    public void duplicate() {
        assertEquals(DuplicateNumber.duplicate(new int [] {1,0,0,8}),0);
    }
}