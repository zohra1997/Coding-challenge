package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemovigDuplicatesTest {

    @Test
    public void functionApi() {
        Integer[] array = new Integer [] {1,2,3,4,4,4,4,5,5,5,6,6,7,7,8,8};
        assertEquals(RemovigDuplicates.functionApi(array),8);
    }

    @Test
    public void function() {
        int [] array = new int [] {1,2,3,4,4,4,4,5,5,5,6,6,7,7,8,8};
        assertEquals(RemovigDuplicates.function(array),8);

    }
}