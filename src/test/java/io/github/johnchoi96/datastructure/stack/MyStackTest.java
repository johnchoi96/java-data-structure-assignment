package io.github.johnchoi96.datastructure.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {

    @Test
    public void testPushOneElement() {
        MyStack<Integer> stack = new MyStack<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertEquals(1, stack.getSize());
    }

    @Test
    public void testPushMultipleElements() {
        MyStack<Integer> stack = new MyStack<>();
        assertTrue(stack.isEmpty());
        int numElements = 100;
        for (int i = 0; i < numElements; i++) {
            stack.push(i);
        }
        assertEquals(numElements, stack.getSize());
    }

    @Test
    public void testPopWithOneElement() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        Integer popped = stack.pop();
        assertEquals(0, stack.getSize());
        assertEquals(popped, Integer.valueOf(1));
    }

    @Test
    public void testPopWithMultipleElements() {
        MyStack<Integer> stack = new MyStack<>();
        int numElements = 100;
        for (int i = 0; i < numElements; i++) {
            stack.push(i);
        }
        for (int i = numElements - 1; i >= 0; i--) {
            Integer popped = stack.pop();
            assertEquals(popped, Integer.valueOf(i));
        }
        assertTrue(stack.isEmpty());
    }

    @Test(expected = IllegalStateException.class)
    public void testPopWithNoElement() {
        MyStack<String> stack = new MyStack<>();
        stack.pop();
    }

    @Test(expected = IllegalStateException.class)
    public void testPeekWithNoElement() {
        MyStack<String> stack = new MyStack<>();
        stack.peek();
    }

    @Test
    public void testPeekWithOneElement() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        Integer peekedElement = stack.peek();
        assertEquals(1, stack.getSize());
        assertEquals(peekedElement, Integer.valueOf(1));
    }

    @Test
    public void testPeekWithMultipleElement() {
        MyStack<Integer> stack = new MyStack<>();
        int numElements = 100;
        for (int i = 0; i < numElements; i++) {
            stack.push(i);
        }
        Integer peekedElement = stack.peek();
        assertEquals(peekedElement, Integer.valueOf(numElements - 1));
    }

    @Test
    public void testGetSizeWithNoElement() {
        MyStack<Integer> stack = new MyStack<>();
        assertEquals(0, stack.getSize());
    }

    @Test
    public void testGetSizeWithOneElement() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        assertEquals(1, stack.getSize());
    }

    @Test
    public void testGetSizeWithMultipleElements() {
        MyStack<Integer> stack = new MyStack<>();
        int numElements = 100;
        for (int i = 0; i < numElements; i++) {
            stack.push(i);
        }
        assertEquals(numElements, stack.getSize());
    }

    @Test
    public void testIsEmptyWithNoElement() {
        MyStack<Integer> stack = new MyStack<>();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmptyWithOneElement() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testIsEmptyWithMultipleElements() {
        MyStack<Integer> stack = new MyStack<>();
        int numElements = 100;
        for (int i = 0; i < numElements; i++) {
            stack.push(i);
        }
        assertFalse(stack.isEmpty());
    }
}
