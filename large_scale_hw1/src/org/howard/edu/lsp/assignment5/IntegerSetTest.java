package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment5.IntegerSet.IntegerSetException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

public class IntegerSetTest {
    private IntegerSet setA;
    private IntegerSet setB;

    @BeforeEach
    void setUp() {
        setA = new IntegerSet();
        setB = new IntegerSet(new ArrayList<>(List.of(1, 2, 3, 4, 5)));
    }

    @Test
    @DisplayName("Test case for clear")
    void testClear() {
        setA.add(1);
        setA.clear();
        assertTrue(setA.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    void testLength() {
        assertEquals(0, setA.length());
        assertEquals(5, setB.length());
    }

    @Test
    @DisplayName("Test case for equals")
    void testEquals() {
        assertTrue(setA.equals(setA));
        assertFalse(setA.equals(setB));
    }

    @Test
    @DisplayName("Test case for contains")
    void testContains() {
        assertTrue(setB.contains(3));
        assertFalse(setA.contains(1));
    }

    @Test
    @DisplayName("Test case for largest")
    void testLargest() throws IntegerSetException {
        assertThrows(IntegerSetException.class, () -> setA.largest());
        assertEquals(5, setB.largest());
    }

    @Test
    @DisplayName("Test case for smallest")
    void testSmallest() throws IntegerSetException {
        assertThrows(IntegerSetException.class, () -> setA.smallest());
        assertEquals(1, setB.smallest());
    }

    @Test
    @DisplayName("Test case for add")
    void testAdd() {
        setA.add(1);
        assertTrue(setA.contains(1));
    }

    @Test
    @DisplayName("Test case for remove")
    void testRemove() {
        setB.remove(3);
        assertFalse(setB.contains(3));
    }

    @Test
    @DisplayName("Test case for union")
    void testUnion() {
        IntegerSet setC = new IntegerSet(new ArrayList<>(List.of(3, 4, 5, 6, 7)));
        setA.union(setB);
        assertTrue(setA.equals(setB));
        setA.clear();
        setA.union(setC);
        assertTrue(setA.equals(setC));
    }

    @Test
    @DisplayName("Test case for intersect")
    void testIntersect() {
        IntegerSet setC = new IntegerSet(new ArrayList<>(List.of(3, 4, 5, 6, 7)));
        IntegerSet setD = new IntegerSet(new ArrayList<>(List.of(3, 4, 5)));
        setB.intersect(setC);
        assertTrue(setB.equals(setD));
    }

    @Test
    @DisplayName("Test case for diff")
    void testDiff() {
        IntegerSet setC = new IntegerSet(new ArrayList<>(List.of(3, 4, 5, 6, 7)));
        IntegerSet setD = new IntegerSet(new ArrayList<>(List.of(1, 2)));
        setB.diff(setC);
        assertTrue(setB.equals(setD));
    }

    @Test
    @DisplayName("Test case for complement")
    void testComplement() {
        IntegerSet setC = new IntegerSet(new ArrayList<>(List.of(3, 4, 5, 6, 7)));
        IntegerSet setD = new IntegerSet(new ArrayList<>(List.of(6, 7)));
        setB.complement(setC);
        assertTrue(setB.equals(setD));
    }

    @Test
    @DisplayName("Test case for empty")
    void testIsEmpty() {
        assertTrue(setA.isEmpty());
        assertFalse(setB.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    void testToString() {
        assertEquals("", setA.toString());
        assertEquals("1, 2, 3, 4, 5, ", setB.toString());
    }
}
