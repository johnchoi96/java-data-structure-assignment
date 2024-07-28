package io.github.johnchoi96.datastructure.sort;

import io.github.johnchoi96.datastructure.list.MyList;

import java.util.List;

public abstract class SortMachineTest {

    protected boolean isEqual(MyList<?> list1, List<?> list2) {
        if (list1.getSize() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.getSize(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
