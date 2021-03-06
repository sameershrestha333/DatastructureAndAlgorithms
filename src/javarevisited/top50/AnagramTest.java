package javarevisited.top50;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void testIsAnagram() {
        assertTrue(AnagramCheck.isAnagram("word", "wrdo"));
        assertTrue(AnagramCheck.isAnagram("mary", "army"));
        assertTrue(AnagramCheck.isAnagram("stop", "tops"));
        assertTrue(AnagramCheck.isAnagram("boat", "btoa"));
        assertFalse(AnagramCheck.isAnagram("pure", "in"));
        assertFalse(AnagramCheck.isAnagram("fill", "fil"));
        assertFalse(AnagramCheck.isAnagram("b", "bbb"));
        assertFalse(AnagramCheck.isAnagram("ccc", "ccccccc"));
        assertTrue(AnagramCheck.isAnagram("a", "a"));
        assertFalse(AnagramCheck.isAnagram("sleep", "slep"));

    }

    @Test
    public void testisAnagram() {
        assertTrue(AnagramCheck.isAnagram("word", "wrdo"));
        assertTrue(AnagramCheck.isAnagram("boat", "btoa"));
        assertFalse(AnagramCheck.isAnagram("pure", "in"));
        assertFalse(AnagramCheck.isAnagram("fill", "fil"));
        assertTrue(AnagramCheck.isAnagram("a", "a"));
        assertFalse(AnagramCheck.isAnagram("b", "bbb"));
        assertFalse(AnagramCheck.isAnagram("ccc", "ccccccc"));
        assertFalse(AnagramCheck.isAnagram("sleep", "slep"));

    }

    @Test
    public void testisAnagramII() {
        assertTrue(AnagramCheck.isAnagram("word", "wrdo"));
        assertFalse(AnagramCheck.isAnagram("b", "bbb"));
        assertFalse(AnagramCheck.isAnagram("ccc", "ccccccc"));
        assertTrue(AnagramCheck.isAnagram("a", "a"));
        assertFalse(AnagramCheck.isAnagram("sleep", "slep"));
        assertTrue(AnagramCheck.isAnagram("boat", "btoa"));
        assertFalse(AnagramCheck.isAnagram("pure", "in"));
        assertFalse(AnagramCheck.isAnagram("fill", "fil"));

    }
}


