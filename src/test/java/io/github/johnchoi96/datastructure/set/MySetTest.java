package io.github.johnchoi96.datastructure.set;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MySetTest {

    @Test
    public void testAddNothing() {
        MySet<Integer> set = new MySet<>();
        assertEquals(set.getSize(), 0);
    }

    @Test
    public void testAddOne() {
        MySet<String> set = new MySet<>();
        set.add("Jane");
        assertEquals(set.getSize(), 1);
    }

    @Test
    public void testAdd_twoElements() {
        MySet<String> set = new MySet<>();
        set.add("Mario");
        set.add("Luigi");
        assertEquals(set.getSize(), 2);
    }

    @Test
    public void testAddMultiple() {
        Integer[] testData = {1, 5, 6, 10, 100, -5};
        MySet<Integer> set = new MySet<>();
        for (int number : testData) {
            set.add(number);
        }
        assertEquals(6, set.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTryRemovingNonExistingElement() {
        MySet<Integer> set = new MySet<>();
        set.remove(3);
    }

    @Test
    public void testRemoveWithOneElement() {
        MySet<String> set = new MySet<>();
        set.add("Hi");
        String removed = set.remove("Hi");
        assertEquals(0, set.getSize());
        assertEquals(removed, "Hi");
    }

    @Test
    public void testRemoveWithMultipleElements() {
        Integer[] testData = {1, 5, 6, 10, 100, -5};
        MySet<Integer> set = new MySet<>();
        for (int number : testData) {
            set.add(number);
        }
        for (Integer num : testData) {
            assertEquals(num, set.remove(num));
        }
        assertEquals(0, set.getSize());
    }

    @Test
    public void testGetSizeWithNoElements() {
        MySet<String> set = new MySet<>();
        assertEquals(0, set.getSize());
    }

    @Test
    public void testGetSizeWithMultipleElements() {
        MySet<Integer> set = new MySet<>();
        int numOfElements = 100;
        for (int i = 0; i < numOfElements; i++) {
            set.add(i);
        }
        assertEquals(numOfElements, set.getSize());
    }

    @Test
    public void testGetSizeWithOneElement() {
        MySet<String> set = new MySet<>();
        set.add("Hello");
        assertEquals(1, set.getSize());
    }

    @Test
    public void testIsEmptyWithNoElements() {
        MySet<String> set = new MySet<>();
        assertTrue(set.isEmpty());
    }

    @Test
    public void testIsEmptyWithMultipleElements() {
        MySet<Integer> set = new MySet<>();
        int numOfElements = 100;
        for (int i = 0; i < numOfElements; i++) {
            set.add(i);
        }
        assertFalse(set.isEmpty());
    }
}
