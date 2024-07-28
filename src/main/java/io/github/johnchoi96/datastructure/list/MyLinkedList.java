package io.github.johnchoi96.datastructure.list;

import org.apache.commons.lang3.NotImplementedException;

public class MyLinkedList<E> implements MyList<E> {

    public static class Node<E> {
        E data;

        Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<E> head;

    /**
     * Adds element at the end of the list.
     * For example, adding [1, 2, 3, 4] in order should result in:
     * 1 -> 2 -> 3 -> 4 -> null
     *
     * @param element to add
     */
    @Override
    public void add(E element) {
        throw new NotImplementedException("Not Implemented");
    }

    /**
     * Adds element at the front of the list.
     * For example, adding [1, 2, 3, 4] in order should result in:
     * 4 -> 3 -> 2 -> 1 -> null
     *
     * @param element to add
     */
    public void addAtFront(E element) {
        throw new NotImplementedException("Not Implemented");
    }

    /**
     * Removes an element at the given index from the list.
     * For example, linked list with:
     * 1 -> 2 -> 3 -> 4 -> null
     * with removal index of 2 should result in:
     * 1 -> 2 -> 4 -> null
     * If index is invalid, throw IllegalArgumentException.
     *
     * @param index removal index
     * @return removed element
     * @throws IllegalArgumentException if index is invalid
     */
    @Override
    public E remove(int index) {
        throw new NotImplementedException("Not Implemented");
    }

    /**
     * Removes an element from the head of the list.
     * For example, linked list with:
     * 1 -> 2 -> 3 -> 4 -> null
     * should result in:
     * 2 -> 3 -> 4 -> null
     * If removal is invalid, throw IllegalStateException.
     *
     * @return removed element
     * @throws IllegalStateException if removal is invalid
     */
    @Override
    public E remove() {
        throw new NotImplementedException("Not Implemented");
    }

    /**
     * Returns an element at the given index.
     * For example, linked list with:
     * 1 -> 2 -> 3 -> 4 -> null
     * with given index of 2 should result in:
     * 3
     * If index is invalid, throw IllegalArgumentException.
     *
     * @param index of the element to retrieve
     * @return element at the given index
     * @throws IllegalArgumentException if index is invalid
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
     * For example, linked list with:
     * 1 -> 2 -> 3 -> 4 -> null
     * with index: 2 and element: -5
     * should result in:
     * 1 -> 2 -> -5 -> 4 -> null
     * Throw an IllegalArgumentException if index is invalid.
     *
     * @param index   of the list to replace
     * @param element new element
     * @return original element
     * @throws IllegalArgumentException if index is invalid
     */
    @Override
    public E replace(int index, E element) {
        throw new NotImplementedException("Not Implemented");
    }

    /**
     * Converts the current state of MyLinkedList to MyArrayList.
     * For example, linked list with:
     * 3 -> 2 -> -5 -> 2 -> 7 -> null
     * should return MyArrayList of:
     * [3, 2, -5, 2, 7].
     *
     * @return array list with same data as linked list
     */
    public MyArrayList<E> convertToArrayList() {
        throw new NotImplementedException("Not Implemented");
    }
}
