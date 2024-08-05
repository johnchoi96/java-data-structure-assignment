package io.github.johnchoi96.datastructure.list;

public class MyArrayList<E> implements MyList<E> {

    private Object[] internalList;

    private int capacity;

    private int size;

    public MyArrayList() {
        capacity = 20;
        size = 0;
        internalList = new Object[capacity];
    }

    /**
     * Adds element at the end of the list.
     * For example, adding [1, 2, 3, 4] in order should result in:
     * [1, 2, 3, 4]
     *
     * @param element to add
     */
    @Override
    public void add(E element) {
        if (size >= capacity) {
            resizeInternalList();
        }
        internalList[size] = element;
        size++;
    }

    /**
     * Adds element at the front of the list.
     * For example, adding [1, 2, 3, 4] in order should result in:
     * [4, 3, 2, 1]
     *
     * @param element to add
     */
    @Override
    public void addAtFront(E element) {
        if (size >= capacity) {
            resizeInternalList();
        }
        // shift everything to the right by one index
        for (int i = size; i > 0; i--) {
            internalList[i] = internalList[i - 1];
        }
        internalList[0] = element;
        size++;
    }

    private void resizeInternalList() {
        int newCapacity = capacity * 2;
        Object[] temp = new Object[newCapacity];
        for (int i = 0; i < internalList.length; i++) {
            temp[i] = internalList[i];
        }
        internalList = temp;
        capacity = newCapacity;
    }

    /**
     * Removes an element at the given index from the list.
     * For example, array list with:
     * [1, 2, 3, 4]
     * with removal index of 2 should result in:
     * [1, 2, 4]
     * If index is invalid, throw IllegalArgumentException.
     *
     * @param index removal index
     * @return removed element
     */
    @Override
    @SuppressWarnings("unchecked")
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        Object removedObject = internalList[index];
        for (int i = index; i < size; i++) {
            internalList[i] = internalList[i + 1];
        }
        size--;
        return (E) removedObject;
    }

    /**
     * Removes an element from the end of the list.
     * For example, array list with:
     * [1, 2, 3, 4]
     * should result in:
     * [1, 2, 3]
     * If removal is invalid, throw IllegalStateException.
     *
     * @return removed element
     */
    @Override
    @SuppressWarnings("unchecked")
    public E remove() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        Object removedObject = internalList[size - 1];
        size--;
        return (E) removedObject;
    }

    /**
     * Returns an element at the given index.
     * For example, array list with:
     * [1, 2, 3, 4]
     * with given index of 2 should result in:
     * 3
     * If index is invalid, throw IllegalArgumentException.
     *
     * @param index of the element to retrieve
     * @return element at the given index
     */
    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        return (E) internalList[index];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return getSize() == 0;
    }

    /**
     * Replaces an original element at the given index with the new element.
     * For example, array list with:
     * [1, 2, 3, 4]
     * with index: 2 and element: -5
     * should result in:
     * [1, 2, -5, 4]
     * Throw an IllegalArgumentException if index is invalid.
     *
     * @param index   of the list to replace
     * @param element new element
     * @return original element
     */
    @Override
    @SuppressWarnings("unchecked")
    public E replace(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        Object originalElement = internalList[index];
        internalList[index] = element;
        return (E) originalElement;
    }
}
