package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordTest {

    @Test
    public void reverseWords() {
        assertEquals(ReverseWord.reverseWords("hello how are you"),"you are how hello");
    }
}