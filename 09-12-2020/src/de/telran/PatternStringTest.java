package de.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternStringTest extends PatternString {
    PatternString str = new PatternString();

    @Test
    void testSearchPattern_True() {

        assertTrue(str.searchPattern("hello", ""));
        assertTrue(str.searchPattern("hello", "hll"));
        assertTrue(str.searchPattern("krankenkasse", "knk"));

    }

    @Test
    void testSearchPattern_False() {

        assertFalse(str.searchPattern("hello", "len"));
        assertFalse(str.searchPattern("krankenkasse", "aaakkkss"));

    }
}