package io.github.johnchoi96.datastructure.queue;

import io.github.johnchoi96.datastructure.list.MyArrayList;
import io.github.johnchoi96.datastructure.list.MyList;

/**
 * Use either MyArrayList or MyLinkedList for implementation.
 *
 * @param <E> generic type
 */
public class MyQueue<E> {

    private final MyList<E> internalList;

    public MyQueue() {
        // choose one of the following:
        internalList = new MyArrayList<>();
//        internalList = new MyLinkedList<>();
    }

    /**
     * Adds an element to the Queue.
     * For example, adding 1, 3, 5, 2 in order should result in the queue:
     * front [1, 3, 5, 2] back
     *
     * @param element to enqueue
     */
    public void enqueue(E element) {
        internalList.add(element);
    }

    /**
     * Removes an element from the queue.
     * For example, removing an element from queue:
     * front [1, 3, 5, 2] back
     * should return 1 and result in queue:
     * front [3, 5, 2] back
     *
     * @return removed element
     * @throws IllegalStateException if element removal is invalid
     */
    public E dequeue() {
        if (internalList.isEmpty()) {
            throw new IllegalStateException();
        }
        return internalList.remove(0);
    }

    /**
     * Returns the next element in order from the queue.
     * For example, peeking from queue:
     * front [1, 3, 5, 2] back
     * should return 1.
     *
     * @return next element in queue
     * @throws IllegalStateException if peek is invalid
     */
    public E peek() {
        if (internalList.isEmpty()) {
            throw new IllegalStateException();
        }
        return internalList.get(0);
    }

    /**
     * Returns the current size of the queue.
     *
     * @return the size
     */
    public int getSize() {
        return internalList.getSize();
    }

    /**
     * Returns true if queue is currently empty.
     *
     * @return true if queue is empty
     */
    public boolean isEmpty() {
        return internalList.isEmpty();
    }
}
