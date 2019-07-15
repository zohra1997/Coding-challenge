package ca.jrvs.challenge;

import org.junit.Test;

import static ca.jrvs.challenge.ValidAnargam.Anargam;
import static org.junit.Assert.*;

public class ValidAnargamTest {
    @Test
    public void anargam(){
        assertEquals(true, Anargam("come","emoc"));
        assertEquals(false, Anargam("hello","bye"));
        assertEquals(false, Anargam("apple","peach"));
    }


}