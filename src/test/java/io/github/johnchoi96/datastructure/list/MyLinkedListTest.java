package io.github.johnchoi96.datastructure.list;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void testAddNothing() {
        MyList<Integer> list = new MyLinkedList<>();
        assertEquals(list.getSize(), 0);
    }

    @Test
    public void testAddOne() {
        MyList<String> list = new MyLinkedList<>();
        list.add("Jane");
        assertEquals(list.getSize(), 1);
        assertEquals(list.get(0), "Jane");
    }

    @Test
    public void testAdd_twoElements() {
        MyList<String> list = new MyLinkedList<>();
        list.add("Mario");
        list.add("Luigi");
        assertEquals(list.getSize(), 2);
        assertEquals(list.get(0), "Mario");
        assertEquals(list.get(1), "Luigi");
    }

    @Test
    public void testAddMultiple() {
        Integer[] testData = {1, 5, 6, 10, 100, -5};
        MyList<Integer> list = new MyLinkedList<>();
        for (int number : testData) {
            list.add(number);
        }
        assertEquals(6, list.getSize());
        for (int i = 0; i < testData.length; i++) {
            assertEquals(testData[i], list.get(i));
        }
    }

    @Test
    public void testAddAtFrontNothing() {
        MyList<Integer> list = new MyLinkedList<>();
        assertEquals(list.getSize(), 0);
    }

    @Test
    public void testAddAtFront_TwoElements() {
        MyList<String> list = new MyLinkedList<>();
        list.addAtFront("Mario");
        list.addAtFront("Luigi");
        assertEquals(list.getSize(), 2);
        assertEquals(list.get(0), "Luigi");
        assertEquals(list.get(1), "Mario");
    }

    @Test
    public void testAddAtFrontMultiple() {
        Integer[] testData = {1, 5, 6, 10, 100, -5};
        MyList<Integer> list = new MyLinkedList<>();
        for (int number : testData) {
            list.addAtFront(number);
        }
        assertEquals(testData.length, list.getSize());
        for (int i = 0, j = testData.length - 1; i < testData.length; i++, j--) {
            assertEquals(testData[j], list.get(i));
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testTryRemovingWithNothing() {
        MyList<Integer> list = new MyLinkedList<>();
        list.remove();
    }

    @Test
    public void testRemoveWithOneElement() {
        MyList<String> list = new MyLinkedList<>();
        list.add("Hi");
        String removed = list.remove();
        assertEquals(0, list.getSize());
        assertEquals(removed, "Hi");
    }

    @Test
    public void testRemoveWithMultipleElements() {
        Integer[] testData = {1, 5, 6, 10, 100, -5};
        int expectedSize = testData.length;
        MyList<Integer> list = new MyLinkedList<>();
        for (int number : testData) {
            list.add(number);
        }
        for (int i = 0; i < expectedSize; i++) {
            assertEquals(testData[i], list.remove());
        }
        assertEquals(0, list.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTryRemovingWithNothingWithIndex() {
        MyList<Integer> list = new MyLinkedList<>();
        list.remove(0);
    }

    @Test
    public void testTryRemovingOutOfBoundsElementWithNothingWithIndex() {
        MyList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.remove(5);
    }

    @Test
    public void testTryRemovingOneWithIndex() {
        MyList<String> list = new MyLinkedList<>();
        list.add("Hi");
        String removed = list.remove(0);
        assertEquals(0, list.getSize());
        assertEquals(removed, "Hi");
    }

    @Test
    public void testTryRemovingOneFromMultipleElementsWithIndex() {
        MyList<String> list = new MyLinkedList<>();
        list.add("Hello");
        list.add("World");
        String removed = list.remove(0);
        assertEquals(1, list.getSize());
        assertEquals(removed, "Hello");
    }

    @Test
    public void testGetSizeWithNoElements() {
        MyList<String> list = new MyLinkedList<>();
        assertEquals(0, list.getSize());
    }

    @Test
    public void testGetSizeWithMultipleElements() {
        MyList<Integer> list = new MyLinkedList<>();
        int numOfElements = 100;
        for (int i = 0; i < numOfElements; i++) {
            list.add(i);
        }
        assertEquals(numOfElements, list.getSize());
    }

    @Test
    public void testGetSizeWithOneElement() {
        MyList<String> list = new MyLinkedList<>();
        list.add("Hello");
        assertEquals(1, list.getSize());
    }

    @Test
    public void testIsEmptyWithNoElements() {
        MyList<String> list = new MyLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testIsEmptyWithMultipleElements() {
        MyList<Integer> list = new MyLinkedList<>();
        int numOfElements = 100;
        for (int i = 0; i < numOfElements; i++) {
            list.add(i);
        }
        assertFalse(list.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWithNoElements() {
        MyList<String> list = new MyLinkedList<>();
        list.replace(1, "Hi");
    }

    @Test
    public void testReplaceWithOneElement() {
        MyList<String> list = new MyLinkedList<>();
        list.add("Hello");
        String original = list.replace(0, "World");
        assertEquals("World", list.get(0));
        assertEquals(1, list.getSize());
        assertEquals(original, "Hello");
    }

    @Test
    public void testReplaceWithMultipleElements_firstElement() {
        MyList<Integer> list = new MyLinkedList<>();
        int numOfElements = 100;
        for (int i = 0; i < numOfElements; i++) {
            list.add(i);
        }
        Integer original = list.replace(0, -1);
        assertEquals(Integer.valueOf(-1), list.get(0));
        assertEquals(numOfElements, list.getSize());
        assertEquals(original, Integer.valueOf(0));
    }

    @Test
    public void testReplaceWithMultipleElements_centerElement() {
        MyList<Integer> list = new MyLinkedList<>();
        int numOfElements = 100;
        for (int i = 0; i < numOfElements; i++) {
            list.add(i);
        }
        int indexToReplace = numOfElements / 2;
        Integer originalCenterValue = list.get(indexToReplace);
        Integer original = list.replace(indexToReplace, -1);
        assertEquals(Integer.valueOf(-1), list.get(indexToReplace));
        assertEquals(numOfElements, list.getSize());
        assertEquals(original, originalCenterValue);
    }

    @Test
    public void testReplaceWithMultipleElements_lastElement() {
        MyList<Integer> list = new MyLinkedList<>();
        int numOfElements = 100;
        for (int i = 0; i < numOfElements; i++) {
            list.add(i);
        }
        int indexToReplace = numOfElements - 1;
        Integer originalLastValue = list.get(indexToReplace);
        Integer original = list.replace(indexToReplace, -1);
        assertEquals(Integer.valueOf(-1), list.get(indexToReplace));
        assertEquals(numOfElements, list.getSize());
        assertEquals(original, originalLastValue);
    }

    @Test
    public void testReplaceWithMultipleElements_ensure_get_still_works() {
        MyList<Integer> list = new MyLinkedList<>();
        int numOfElements = 100;
        for (int i = 0; i < numOfElements; i++) {
            list.add(i);
        }
        int indexToReplace = numOfElements / 2;
        list.replace(indexToReplace, -1);
        // ensure get works correctly
        for (int i = 0; i < numOfElements; i++) {
            if (i == indexToReplace) {
                assertEquals(Integer.valueOf(-1), list.get(i));
            } else {
                assertEquals(Integer.valueOf(i), list.get(i));
            }
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWithMultipleElements_indexOutOfBounds() {
        MyList<Integer> list = new MyLinkedList<>();
        int numOfElements = 100;
        for (int i = 0; i < numOfElements; i++) {
            list.add(i);
        }
        int indexToReplace = numOfElements * 2;
        list.replace(indexToReplace, -1);
    }

    @Test
    public void testConvertToArrayList_noElement() {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        MyArrayList<Integer> convertedArrayList = linkedList.convertToArrayList();
        assertEquals(0, convertedArrayList.getSize());
    }

    @Test
    public void testConvertToArrayList_oneElement() {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(5);
        MyArrayList<Integer> convertedArrayList = linkedList.convertToArrayList();
        assertEquals(Integer.valueOf(5), convertedArrayList.get(0));
        assertEquals(1, convertedArrayList.getSize());
    }

    @Test
    public void testConvertToArrayList_multipleElements() {
        int numOfElements = 100;
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        for (int i = 0; i < numOfElements; i++) {
            linkedList.add(numOfElements);
        }
        MyArrayList<Integer> convertedArrayList = linkedList.convertToArrayList();
        assertEquals(convertedArrayList.getSize(), linkedList.getSize());
        for (int i = 0; i < numOfElements; i++) {
            assertEquals(linkedList.get(i), convertedArrayList.get(i));
        }
    }
}
