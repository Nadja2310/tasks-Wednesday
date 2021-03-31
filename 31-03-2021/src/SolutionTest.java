import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void task1() {
        assertEquals("Hello world", solution.task1("Hello world und", 13));
    }

    @Test
    void task1_2() {
        assertEquals("Hello", solution.task1("Hello world", 5));
    }

    @Test
    void task1_3() {
        assertEquals("Hello", solution.task1("Hello world", 8));
    }

    @Test
    void task1_indexEqualToTheLength() {
        assertEquals("Hello world", solution.task1("Hello world", 11));
    }

    @Test
    void task1_indexMoreLength() {
        assertEquals("Hello world", solution.task1("Hello world", 13));
    }

    @Test
    void task2() {
    }
}