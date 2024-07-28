package io.github.johnchoi96.datastructure.sort;

import io.github.johnchoi96.datastructure.list.MyList;

public abstract class SortingMachine<E> {

    protected MyList<E> internalList;

    public SortingMachine(MyList<E> inputList) {
        internalList = inputList;
    }

    /**
     * Sorts the internal list in ascending order and return the result.
     *
     * @return sorted list
     */
    public abstract MyList<E> getSortedList();
}
