package io.github.johnchoi96.datastructure.sort;

import io.github.johnchoi96.datastructure.list.MyList;
import org.apache.commons.lang3.NotImplementedException;

public class MergeSortMachine<E> extends SortingMachine<E> {

    public MergeSortMachine(MyList<E> inputList) {
        super(inputList);
    }

    // TODO: Start implementing algorithm here
    @Override
    public MyList<E> getSortedList() {
        throw new NotImplementedException();
    }

    private MyList<E> mergeSort(MyList<E> list) {
        throw new NotImplementedException();
    }

    private MyList<E> merge(MyList<E> list1, MyList<E> list2) {
        throw new NotImplementedException();
    }
}
