package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {

    @Test
    public void testFixStringWithEmptyString() {
        String input = "";
        String result = Task4.fixString(input);
        assertEquals("", result);
    }

    @Test
    public void testFixStringWithEvenLengthString() {
        String input = "abcd";
        String result = Task4.fixString(input);
        assertEquals("bacd", result);
    }

    @Test
    public void testFixStringWithOddLengthString() {
        String input = "abcde";
        String result = Task4.fixString(input);
        assertEquals("bacde", result);
    }

    @Test
    public void testFixStringWithSpecialCharacters() {
        String input = "a@b#c$d";
        String result = Task4.fixString(input);
        assertEquals("@a#b$c$d", result);
    }

    @Test
    public void testFixStringWithWhitespace() {
        String input = "a b c d";
        String result = Task4.fixString(input);
        assertEquals(" a b c d", result);
    }
}
