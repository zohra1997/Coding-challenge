package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementTest {

    @Test
    public void removeElement() {
       assertEquals(RemoveElement.removeElement((new int []{1,2,3,5,6,4,1,1}),1),5);
    }
}