package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {

    @Test
    public void testVideoLengthValidInput() {
        String timeString = "03:45";
        int result = Task1.VideoLength(timeString);
        assertEquals(225, result);
    }

    @Test
    public void testVideoLengthInvalidFormat() {
        String timeString = "03:45:10";
        int result = Task1.VideoLength(timeString);
        assertEquals(-1, result);
    }

    @Test
    public void testVideoLengthInvalidSeconds() {
        String timeString = "02:60";
        int result = Task1.VideoLength(timeString);
        assertEquals(-1, result);
    }

    @Test
    public void testVideoLengthInvalidInput() {
        String timeString = "abc:def";
        int result = Task1.VideoLength(timeString);
        assertEquals(-1, result);
    }
}
