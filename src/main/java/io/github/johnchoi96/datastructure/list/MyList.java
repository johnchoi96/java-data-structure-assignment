package io.github.johnchoi96.datastructure.list;

public interface MyList<E> {

    void add(E element);

    E remove(int index);

    E remove();

    E get(int index);

    int getSize();

    boolean isEmpty();

    E replace(int index, E element);
}
