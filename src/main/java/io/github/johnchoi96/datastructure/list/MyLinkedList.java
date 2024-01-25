package io.github.johnchoi96.datastructure.list;

import jdk.jshell.spi.ExecutionControl;

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
     * @param element to add
     */
    @Override
    public void add(E element) {
        try {
            throw new ExecutionControl.NotImplementedException("Not Implemented");
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Adds element at the front of the list.
     * For example, adding [1, 2, 3, 4] in order should result in:
     * 4 -> 3 -> 2 -> 1 -> null
     * @param element to add
     */
    public void addAtFront(E element) {
        try {
            throw new ExecutionControl.NotImplementedException("Not Implemented");
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Removes an element at the given index from the list.
     * For example, linked list with:
     * 1 -> 2 -> 3 -> 4 -> null
     * with removal index of 2 should result in:
     * 1 -> 2 -> 4 -> null
     * If index is invalid, throw IllegalArgumentException.
     * @param index removal index
     * @return removed element
     */
    @Override
    public E remove(int index) {
        try {
            throw new ExecutionControl.NotImplementedException("Not Implemented");
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Removes an element from the head of the list.
     * For example, linked list with:
     * 1 -> 2 -> 3 -> 4 -> null
     * should result in:
     * 2 -> 3 -> 4 -> null
     * If removal is invalid, throw IllegalStateException.
     * @return removed element
     */
    @Override
    public E remove() {
        try {
            throw new ExecutionControl.NotImplementedException("Not Implemented");
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns an element at the given index.
     * For example, linked list with:
     * 1 -> 2 -> 3 -> 4 -> null
     * with given index of 2 should result in:
     * 3
     * If index is invalid, throw IllegalArgumentException.
     * @param index of the element to retrieve
     * @return element at the given index
     */
    @Override
    public E get(int index) {
        try {
            throw new ExecutionControl.NotImplementedException("Not Implemented");
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int getSize() {
        try {
            throw new ExecutionControl.NotImplementedException("Not Implemented");
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isEmpty() {
        try {
            throw new ExecutionControl.NotImplementedException("Not Implemented");
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Replaces an original element at the given index with the new element.
     * For example, linked list with:
     * 1 -> 2 -> 3 -> 4 -> null
     * with index: 2 and element: -5
     * should result in:
     * 1 -> 2 -> -5 -> 4 -> null
     * Throw an IllegalArgumentException if index is invalid.
     * @param index of the list to replace
     * @param element new element
     * @return original element
     */
    @Override
    public E replace(int index, E element) {
        try {
            throw new ExecutionControl.NotImplementedException("Not Implemented");
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }
    }
}
