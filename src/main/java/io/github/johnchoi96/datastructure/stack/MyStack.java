package io.github.johnchoi96.datastructure.stack;

import io.github.johnchoi96.datastructure.list.MyLinkedList;
import io.github.johnchoi96.datastructure.list.MyList;

/**
 * Use either MyArrayList or MyLinkedList for implementation.
 *
 * @param <E> generic type
 */
public class MyStack<E> {

    private MyList<E> internalList;

    public MyStack() {
        // choose one of the following:
//        internalList = new MyArrayList<>();
        internalList = new MyLinkedList<>();
    }

    /**
     * Pushes an element to the stack.
     * For example, pushing 1, 3, 2, 5 in order should produce stack of:
     * bottom [1, 3, 2, 5] top
     *
     * @param element to push
     */
    public void push(E element) {
        internalList.addAtFront(element);
    }

    /**
     * Pops an element from the stack.
     * For example, stack of:
     * bottom [1, 3, 2, 5] top
     * and popping an element should return 5 and result in a stack of:
     * bottom [1, 3, 2] top.
     *
     * @return popped element
     * @throws IllegalStateException if unable to pop
     */
    public E pop() {
        if (internalList.isEmpty()) {
            throw new IllegalStateException();
        }
        return internalList.remove();
    }

    /**
     * Returns the top-most element from the stack.
     * For example, stack of:
     * bottom [1, 3, 2, 5] top
     * and peeking an element should return 5 and result in a stack of:
     * bottom [1, 3, 2, 5] top.
     *
     * @return peeked element
     * @throws IllegalStateException if unable to peek
     */
    public E peek() {
        if (internalList.isEmpty()) {
            throw new IllegalStateException();
        }
        return internalList.get(0);
    }

    /**
     * Returns the current size of the stack.
     *
     * @return size of stack
     */
    public int getSize() {
        return internalList.getSize();
    }

    /**
     * Returns true if the stack is currently empty. False if not empty.
     *
     * @return true if stack is empty
     */
    public boolean isEmpty() {
        return internalList.isEmpty();
    }
}
