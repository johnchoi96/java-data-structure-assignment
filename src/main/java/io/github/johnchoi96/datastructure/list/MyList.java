package io.github.johnchoi96.datastructure.list;

public interface MyList<E> {

    void add(E element);

    void addAtFront(E element);

    E remove(int index);

    E remove();

    E get(int index);

    /**
     * Returns the current size of the list in O(1) constant runtime (no loops).
     * @return the current size of the list
     */
    int getSize();

    /**
     * Returns true if the list is empty in O(1) constant runtime (no loops).
     * @return true if list is empty
     */
    boolean isEmpty();

    E replace(int index, E element);
}
