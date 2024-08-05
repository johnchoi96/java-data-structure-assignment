package io.github.johnchoi96.datastructure.set;

import io.github.johnchoi96.datastructure.list.MyArrayList;
import io.github.johnchoi96.datastructure.list.MyList;

/**
 * Use the static Array of Objects for the internal list.
 *
 * @param <E> generic type
 */
public class MySet<E> {

    private final Object[] internalList;

    private int size;

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
        int hashcode = hashCode(newElement);
        int index = Math.abs(hashcode) % internalList.length;
        // just in case we have a collision, we'll have a dynamic list to store element in the index
        MyList<E> list = new MyArrayList<>();
        if (internalList[index] == null) {
            internalList[index] = list;
        }
        MyList<E> listAtIndex = (MyList<E>) internalList[index];
        listAtIndex.add(newElement);
        size++;
    }

    /**
     * Returns the current size of the set.
     *
     * @return the size of the set
     */
    public int getSize() {
        return size;
    }

    /**
     * Returns true if set is empty.
     *
     * @return true or false
     */
    public boolean isEmpty() {
        return size == 0;
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
        if (size == 0) {
            throw new IllegalArgumentException();
        }
        int hashcode = hashCode(element);
        int index = Math.abs(hashcode) % internalList.length;
        MyList<E> listAtIndex = (MyList<E>) internalList[index];
        for (int i = 0; i < listAtIndex.getSize(); i++) {
            if (listAtIndex.get(i).equals(element)) {
                E removedObject = listAtIndex.remove(i);
                if (listAtIndex.isEmpty()) {
                    internalList[index] = null;
                }
                size--;
                return removedObject;
            }
        }
        throw new IllegalArgumentException();
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
        int hashcode = hashCode(element);
        int index = Math.abs(hashcode) % internalList.length;
        if (internalList[index] == null) {
            return false;
        }
        MyList<E> listAtIndex = (MyList<E>) internalList[index];
        for (int i = 0; i < listAtIndex.getSize(); i++) {
            if (listAtIndex.get(i).equals(element)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Generates hashcode for the element.
     *
     * @param element to generate hashcode for
     * @return hashcode for the element
     */
    private int hashCode(E element) {
        return 31 * (element.hashCode() + 51);
    }
}
