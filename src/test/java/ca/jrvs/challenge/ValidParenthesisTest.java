package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesisTest {

    @Test
    public void isValid() {
        assertEquals(ValidParenthesis.isValid("()(){}{}[]"),true);
        assertEquals(ValidParenthesis.isValid("({[]})"),true);
        assertEquals(ValidParenthesis.isValid("(((("),false);

    }
}