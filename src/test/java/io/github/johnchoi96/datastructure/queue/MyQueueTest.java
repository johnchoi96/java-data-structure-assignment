package io.github.johnchoi96.datastructure.queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyQueueTest {

    @Test
    public void testEnqueueOneElement() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        assertEquals(1, queue.getSize());
    }

    @Test
    public void testEnqueueMultipleElements() {
        MyQueue<Integer> queue = new MyQueue<>();
        int numOfElements = 500;
        for (int i = 0; i < numOfElements; i++) {
            queue.enqueue(i);
        }
        assertEquals(numOfElements, queue.getSize());
    }

    @Test(expected = IllegalStateException.class)
    public void testDequeueWithNoElement() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.dequeue();
    }

    @Test
    public void testDequeueWithOneElement() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        Integer dequeuedElement = queue.dequeue();
        assertEquals(dequeuedElement, Integer.valueOf(1));
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testDequeueWithMultipleElements() {
        MyQueue<Integer> queue = new MyQueue<>();
        int numOfElements = 500;
        for (int i = 0; i < numOfElements; i++) {
            queue.enqueue(i);
        }
        for (int i = 0; i < numOfElements; i++) {
            Integer dequeuedElement = queue.dequeue();
            assertEquals(dequeuedElement, Integer.valueOf(i));
        }
        assertTrue(queue.isEmpty());
    }

    @Test(expected = IllegalStateException.class)
    public void testPeekWithNoElement() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.peek();
    }

    @Test
    public void testPeekWithOneElement() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(5);
        Integer peekedElement = queue.peek();
        assertEquals(peekedElement, Integer.valueOf(5));
        assertEquals(1, queue.getSize());
    }

    @Test
    public void testPeekWithMultipleElements() {
        MyQueue<Integer> queue = new MyQueue<>();
        int numOfElements = 500;
        for (int i = 0; i < numOfElements; i++) {
            queue.enqueue(i);
        }
        Integer peekedElement = queue.peek();
        assertEquals(peekedElement, Integer.valueOf(0));
        assertEquals(numOfElements, queue.getSize());
    }

    @Test
    public void testGetSizeNoElement() {
        MyQueue<Integer> queue = new MyQueue<>();
        assertEquals(0, queue.getSize());
    }

    @Test
    public void testGetSizeOneElement() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        assertEquals(1, queue.getSize());
    }

    @Test
    public void testGetSizeMultipleElements() {
        MyQueue<Integer> queue = new MyQueue<>();
        int numOfElements = 500;
        for (int i = 0; i < numOfElements; i++) {
            queue.enqueue(i);
        }
        assertEquals(numOfElements, queue.getSize());
    }

    @Test
    public void testIsEmptyNoElement() {
        MyQueue<Integer> queue = new MyQueue<>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsEmptyOneElement() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testIsEmptyMultipleElements() {
        MyQueue<Integer> queue = new MyQueue<>();
        int numOfElements = 500;
        for (int i = 0; i < numOfElements; i++) {
            queue.enqueue(i);
        }
        assertFalse(queue.isEmpty());
    }
}
