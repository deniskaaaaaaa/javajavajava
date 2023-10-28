package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {

    @Test
    public void testIsNestableWhenNestable() {
        int[] a1 = {1, 2, 3, -1};
        int[] a2 = {0, 4, 5, 6, -1};
        assertTrue(Task3.isNestable(a1, a2));
    }

    @Test
    public void testIsNestableWhenNotNestable() {
        int[] a1 = {1, 2, 3, -1};
        int[] a2 = {0, 2, 5, 6, -1};
        assertFalse(Task3.isNestable(a1, a2));
    }

    @Test
    public void testIsNestableWithEmptyArrays() {
        int[] a1 = {-1};
        int[] a2 = {-1};
        assertTrue(Task3.isNestable(a1, a2));
    }

    @Test
    public void testIsNestableWithEmptyFirstArray() {
        int[] a1 = {-1};
        int[] a2 = {0, 1, 2, 3, -1};
        assertTrue(Task3.isNestable(a1, a2));
    }

    @Test
    public void testIsNestableWithEmptySecondArray() {
        int[] a1 = {1, 2, 3, -1};
        int[] a2 = {-1};
        assertTrue(Task3.isNestable(a1, a2));
    }
}
