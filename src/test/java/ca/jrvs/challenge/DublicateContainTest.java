package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class DublicateContainTest {

    @Test
    public void containsDuplicate() {
        assertEquals(DublicateContain.containsDuplicate(new int []{1,2,3,4,5,6,6}),true);
        assertEquals(DublicateContain.containsDuplicate(new int []{1,2,3,4,5,6}),false);
        assertEquals(DublicateContain.containsDuplicate(new int []{1,2,3,1}),true);
        assertEquals(DublicateContain.containsDuplicate(new int []{1,2,3,4}),false);
    }
}