package io.github.johnchoi96.datastructure.set;

import org.apache.commons.lang3.NotImplementedException;

/**
 * Use the static Array of Objects for the internal list.
 *
 * @param <E> generic type
 */
public class MySet<E> {

    private final Object[] internalList;

    public MySet(int capacity) {
        internalList = new Object[capacity];
    }

    /**
     * Adds a new element to this set.
     *
     * @param newElement to add to the set
     */
    @SuppressWarnings("unchecked")
    public void add(E newElement) {
        throw new NotImplementedException();
    }

    /**
     * Returns the current size of the set.
     *
     * @return the size of the set
     */
    public int getSize() {
        throw new NotImplementedException();
    }

    /**
     * Returns true if set is empty.
     *
     * @return true or false
     */
    public boolean isEmpty() {
        throw new NotImplementedException();
    }

    /**
     * Removes the element from the set and returns the removed element.
     * If element does not exist in the set, throw new IllegalArgumentException().
     *
     * @param element to remove
     * @return removed element
     * @throws IllegalArgumentException if element does not exist
     */
    @SuppressWarnings("unchecked")
    public E remove(E element) {
        throw new NotImplementedException();
    }

    /**
     * Returns true if element is in the set.
     * False if element does not exist.
     *
     * @param element to check
     * @return true if element exists
     */
    @SuppressWarnings("unchecked")
    public boolean contains(E element) {
        throw new NotImplementedException();
    }

    /**
     * Generates hashcode for the element.
     *
     * @param element to generate hashcode for
     * @return hashcode for the element
     */
    private int hashCode(E element) {
        throw new NotImplementedException();
    }
}
