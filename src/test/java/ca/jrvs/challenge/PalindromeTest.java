package ca.jrvs.challenge;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    public Palindrome palindrome;
     public boolean expectedResult;
    @Before
    public void setup (){
    palindrome = new Palindrome();
    }

    @Test
    public void isPalindrome() {
        expectedResult = true;
        boolean actualResult = palindrome.isPalindrome("anna");
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void isPalindrome2(){
         expectedResult = false;
        boolean actualResult = palindrome.isPalindrome("apple");
        assertEquals(expectedResult,actualResult);
    }
}