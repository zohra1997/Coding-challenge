package ca.jrvs.challenge;

import org.junit.Test;

import static ca.jrvs.challenge.EvenOrOdd.*;
import static org.junit.Assert.*;

public class EvenOrOddTest {

    @Test
    public void method1() {
        String expected = "ODD";
        assertEquals(expected, Method1(13));
    }

    @Test
    public void method2() {
        assertEquals("EVEN", Method2(14));

    }
}