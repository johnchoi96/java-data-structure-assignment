package io.github.johnchoi96.datastructure.sort;

import io.github.johnchoi96.datastructure.list.MyArrayList;
import io.github.johnchoi96.datastructure.list.MyList;

public class MergeSortMachine<E extends Comparable<E>> extends SortingMachine<E> {

    public MergeSortMachine(MyList<E> inputList) {
        super(inputList);
    }

    // TODO: Start implementing algorithm here
    @Override
    public MyList<E> getSortedList() {
        return mergeSort(this.internalList);
    }

    private MyList<E> mergeSort(MyList<E> list) {
        if (list.getSize() <= 1) {
            // if list has one or no element, no need to do anything
            return list;
        }
        // divide the list into two
        int midpoint = list.getSize() / 2;
        MyList<E> leftList = new MyArrayList<>();
        MyList<E> rightList = new MyArrayList<>();
        for (int i = 0; i < midpoint; i++) {
            leftList.add(list.get(i));
        }
        for (int i = midpoint; i < list.getSize(); i++) {
            rightList.add(list.get(i));
        }
        // recursively sort left and right lists
        leftList = mergeSort(leftList);
        rightList = mergeSort(rightList);
        // merge two sorted lists into one
        return merge(leftList, rightList);
    }

    private MyList<E> merge(MyList<E> list1, MyList<E> list2) {
        int leftIdx = 0, rightIdx = 0;
        MyList<E> mergedList = new MyArrayList<>();
        while (leftIdx < list1.getSize() && rightIdx < list2.getSize()) {
            if (list1.get(leftIdx).compareTo(list2.get(rightIdx)) < 0) {
                mergedList.add(list1.get(leftIdx));
                leftIdx++;
            } else {
                mergedList.add(list2.get(rightIdx));
                rightIdx++;
            }
        }
        // at this point, one of leftIdx and rightIdx has hit the end of the list
        // add the leftover to the merged list
        if (leftIdx < list1.getSize()) {
            // list1 still has some elements left
            for (int i = leftIdx; i < list1.getSize(); i++) {
                mergedList.add(list1.get(i));
            }
        } else if (rightIdx < list2.getSize()) {
            // list2 still has some elements left
            for (int i = rightIdx; i < list2.getSize(); i++) {
                mergedList.add(list2.get(i));
            }
        }
        return mergedList;
    }
}
