package io.github.johnchoi96.datastructure.list;

import org.apache.commons.lang3.NotImplementedException;

public class MyArrayList<E> implements MyList<E> {

    /**
     * Adds element at the end of the list.
     * For example, adding [1, 2, 3, 4] in order should result in:
     * [1, 2, 3, 4]
     * @param element to add
     */
    @Override
    public void add(E element) {
        throw new NotImplementedException("Not Implemented");
    }

    /**
     * Adds element at the front of the list.
     * For example, adding [1, 2, 3, 4] in order should result in:
     * [4, 3, 2, 1]
     * @param element to add
     */
    @Override
    public void addAtFront(E element) {
        throw new NotImplementedException("Not Implemented");
    }

    /**
     * Removes an element at the given index from the list.
     * For example, array list with:
     * [1, 2, 3, 4]
     * with removal index of 2 should result in:
     * [1, 2, 4]
     * If index is invalid, throw IllegalArgumentException.
     * @param index removal index
     * @return removed element
     */
    @Override
    public E remove(int index) {
        throw new NotImplementedException("Not Implemented");
    }

    /**
     * Removes an element from the front of the list.
     * For example, array list with:
     * [1, 2, 3, 4]
     * should result in:
     * [2, 3, 4]
     * If removal is invalid, throw IllegalStateException.
     * @return removed element
     */
    @Override
    public E remove() {
        throw new NotImplementedException("Not Implemented");
    }

    /**
     * Returns an element at the given index.
     * For example, array list with:
     * [1, 2, 3, 4]
     * with given index of 2 should result in:
     * 3
     * If index is invalid, throw IllegalArgumentException.
     * @param index of the element to retrieve
     * @return element at the given index
     */
    @Override
    public E get(int index) {
        throw new NotImplementedException("Not Implemented");
    }

    @Override
    public int getSize() {
        throw new NotImplementedException("Not Implemented");
    }

    @Override
    public boolean isEmpty() {
        throw new NotImplementedException("Not Implemented");
    }

    /**
     * Replaces an original element at the given index with the new element.
     * For example, array list with:
     * [1, 2, 3, 4]
     * with index: 2 and element: -5
     * should result in:
     * [1, 2, -5, 4]
     * Throw an IllegalArgumentException if index is invalid.
     * @param index of the list to replace
     * @param element new element
     * @return original element
     */
    @Override
    public E replace(int index, E element) {
        throw new NotImplementedException("Not Implemented");
    }
}
