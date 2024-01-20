package io.github.johnchoi96.datastructure.arraylist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyArrayListTest {

    @Test
    public void testAddNothing() {
        MyArrayList<Integer> list = new MyArrayList<>();
        assertEquals(list.getSize(), 0);
    }

    @Test
    public void testAddOne() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Jane");
        assertEquals(list.getSize(), 1);
        assertEquals(list.get(0), "Jane");
    }

    @Test
    public void testAddMultiple() {
        Integer[] testData = {1, 5, 6, 10, 100, -5};
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int number : testData) {
            list.add(number);
        }
        assertEquals(6, list.getSize());
        for (int i = 0; i < testData.length; i++) {
            assertEquals(testData[i], list.get(i));
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testTryRemovingWithNothing() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.remove();
    }

    @Test
    public void testRemoveWithOneElement() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hi");
        String removed = list.remove();
        assertEquals(0, list.getSize());
        assertEquals(removed, "Hi");
    }

    @Test
    public void testRemoveWithMultipleElements() {
        Integer[] testData = {1, 5, 6, 10, 100, -5};
        int expectedSize = testData.length;
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int number : testData) {
            list.add(number);
        }
        for (int i = 0; i < expectedSize; i++) {
            list.remove();
        }
        assertEquals(0, list.getSize());
    }

    @Test(expected = IllegalStateException.class)
    public void testTryRemovingWithNothingWithIndex() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.remove(0);
    }

    @Test
    public void testTryRemovingOutOfBoundsElementWithNothingWithIndex() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.remove(5);
    }

    @Test
    public void testTryRemovingOneWithIndex() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hi");
        String removed = list.remove(0);
        assertEquals(0, list.getSize());
        assertEquals(removed, "Hi");
    }

    @Test
    public void testTryRemovingOneFromMultipleElementsWithIndex() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("World");
        String removed = list.remove(0);
        assertEquals(1, list.getSize());
        assertEquals(removed, "Hello");
    }
}
