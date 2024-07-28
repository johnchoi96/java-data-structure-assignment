package io.github.johnchoi96.datastructure.sort;

import io.github.johnchoi96.datastructure.list.MyArrayList;
import io.github.johnchoi96.datastructure.list.MyList;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class BubbleSortMachineTest extends SortMachineTest {

    @Test
    public void testBubbleSortWithInteger() {
        MyList<Integer> originalList = new MyArrayList<>();
        List<Integer> values = List.of(6, 10, -1, 5, 2, 0, 100, 200, 1512, 4);
        for (Integer value : values) {
            originalList.add(value);
        }

        SortingMachine<Integer> sm = new BubbleSortMachine<>(originalList);
        MyList<Integer> sortedArray = sm.getSortedList();
        assertTrue(isEqual(sortedArray, values.stream().sorted().toList()));
    }

    @Test
    public void testBubbleSortWithString() {
        MyList<String> originalList = new MyArrayList<>();
        List<String> values = List.of("hello", "a", "banana", "zulu", "delta", "foxtrot");
        for (String value : values) {
            originalList.add(value);
        }

        SortingMachine<String> sm = new BubbleSortMachine<>(originalList);
        MyList<String> sortedArray = sm.getSortedList();
        assertTrue(isEqual(sortedArray, values.stream().sorted().toList()));
    }
}
