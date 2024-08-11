package io.github.johnchoi96.datastructure.sort;

import io.github.johnchoi96.datastructure.list.MyList;

public class BubbleSortMachine<E extends Comparable<E>> extends SortingMachine<E> {

    public BubbleSortMachine(MyList<E> inputList) {
        super(inputList);
    }

    // TODO: Start implementing algorithm here
    @Override
    public MyList<E> getSortedList() {
        if (this.internalList.getSize() <= 1) {
            return internalList;
        }
        int lastUnsorted = this.internalList.getSize() - 1;

        while (lastUnsorted > 0) {
            int lastSwapIndex = 0;
            for (int i = 0; i < lastUnsorted; i++) {
                E first = this.internalList.get(i);
                E second = this.internalList.get(i + 1);
                if (first.compareTo(second) > 0) {
                    this.internalList.replace(i, second);
                    this.internalList.replace(i + 1, first);
                    lastSwapIndex = i;
                }
            }
            lastUnsorted = lastSwapIndex;
        }

        return this.internalList;
    }
}
