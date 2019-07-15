package ca.jrvs.challenge;

import org.junit.Test;

import static ca.jrvs.challenge.twoSum.function;
import static org.junit.Assert.*;

public class twoSumTest {

    @Test
    public void FunctionTest() {
        int [] expected = {1,0};
        int [] actual = function(new int[] {2, 7, 5, 11}, 9);
        assertArrayEquals(expected,actual);
    }
};
