package io.github.johnchoi96.datastructure.list;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {

    @Test
    public void testAddNothing() {
        MyList<Integer> list = new MyArrayList<>();
        assertEquals(list.getSize(), 0);
    }

    @Test
    public void testAddOne() {
        MyList<String> list = new MyArrayList<>();
        list.add("Jane");
        assertEquals(list.getSize(), 1);
        assertEquals(list.get(0), "Jane");
    }

    @Test
    public void testAddMultiple() {
        Integer[] testData = {1, 5, 6, 10, 100, -5};
        MyList<Integer> list = new MyArrayList<>();
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
        MyList<Integer> list = new MyArrayList<>();
        list.remove();
    }

    @Test
    public void testRemoveWithOneElement() {
        MyList<String> list = new MyArrayList<>();
        list.add("Hi");
        String removed = list.remove();
        assertEquals(0, list.getSize());
        assertEquals(removed, "Hi");
    }

    @Test
    public void testRemoveWithMultipleElements() {
        Integer[] testData = {1, 5, 6, 10, 100, -5};
        int expectedSize = testData.length;
        MyList<Integer> list = new MyArrayList<>();
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
        MyList<Integer> list = new MyArrayList<>();
        list.remove(0);
    }

    @Test
    public void testTryRemovingOutOfBoundsElementWithNothingWithIndex() {
        MyList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.remove(5);
    }

    @Test
    public void testTryRemovingOneWithIndex() {
        MyList<String> list = new MyArrayList<>();
        list.add("Hi");
        String removed = list.remove(0);
        assertEquals(0, list.getSize());
        assertEquals(removed, "Hi");
    }

    @Test
    public void testTryRemovingOneFromMultipleElementsWithIndex() {
        MyList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("World");
        String removed = list.remove(0);
        assertEquals(1, list.getSize());
        assertEquals(removed, "Hello");
    }

    @Test
    public void testGetSizeWithNoElements() {
        MyList<String> list = new MyArrayList<>();
        assertEquals(0, list.getSize());
    }

    @Test
    public void testGetSizeWithMultipleElements() {
        MyList<Integer> list = new MyArrayList<>();
        int numOfElements = 100;
        for (int i = 0; i < numOfElements; i++) {
            list.add(i);
        }
        assertEquals(numOfElements, list.getSize());
    }

    @Test
    public void testGetSizeWithOneElement() {
        MyList<String> list = new MyArrayList<>();
        list.add("Hello");
        assertEquals(1, list.getSize());
    }

    @Test
    public void testIsEmptyWithNoElements() {
        MyList<String> list = new MyArrayList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testIsEmptyWithMultipleElements() {
        MyList<Integer> list = new MyArrayList<>();
        int numOfElements = 100;
        for (int i = 0; i < numOfElements; i++) {
            list.add(i);
        }
        assertFalse(list.isEmpty());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReplaceWithNoElements() {
        MyList<String> list = new MyArrayList<>();
        list.replace(1, "Hi");
    }

    @Test
    public void testReplaceWithOneElement() {
        MyList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.replace(0, "World");
        assertEquals("World", list.get(0));
        assertEquals(1, list.getSize());
    }

    @Test
    public void testReplaceWithMultipleElements_firstElement() {
        MyList<Integer> list = new MyArrayList<>();
        int numOfElements = 100;
        for (int i = 0; i < numOfElements; i++) {
            list.add(i);
        }
        list.replace(0, -1);
        assertEquals(Integer.valueOf(-1), list.get(0));
        assertEquals(numOfElements, list.getSize());
    }

    @Test
    public void testReplaceWithMultipleElements_centerElement() {
        MyList<Integer> list = new MyArrayList<>();
        int numOfElements = 100;
        for (int i = 0; i < numOfElements; i++) {
            list.add(i);
        }
        int indexToReplace = numOfElements / 2;
        list.replace(indexToReplace, -1);
        assertEquals(Integer.valueOf(-1), list.get(indexToReplace));
        assertEquals(numOfElements, list.getSize());
    }

    @Test
    public void testReplaceWithMultipleElements_lastElement() {
        MyList<Integer> list = new MyArrayList<>();
        int numOfElements = 100;
        for (int i = 0; i < numOfElements; i++) {
            list.add(i);
        }
        int indexToReplace = numOfElements - 1;
        list.replace(indexToReplace, -1);
        assertEquals(Integer.valueOf(-1), list.get(indexToReplace));
        assertEquals(numOfElements, list.getSize());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReplaceWithMultipleElements_indexOutOfBounds() {
        MyList<Integer> list = new MyArrayList<>();
        int numOfElements = 100;
        for (int i = 0; i < numOfElements; i++) {
            list.add(i);
        }
        int indexToReplace = numOfElements * 2;
        list.replace(indexToReplace, -1);
    }
}
