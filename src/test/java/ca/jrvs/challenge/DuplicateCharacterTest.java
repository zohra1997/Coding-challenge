package ca.jrvs.challenge;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ca.jrvs.challenge.DuplicateCharacter.duplicate;
import static org.junit.Assert.*;

public class DuplicateCharacterTest {
    @Test
    public void duplicateChar(){
        String text = "hello from test class";
        List<Character> actuaResult= duplicate(text);
        System.out.println(actuaResult);
        List<Character> expectedResult = Arrays.asList(' ','s','t','e','l','o');
        assertArrayEquals(expectedResult.toArray(),actuaResult.toArray());
    }
}