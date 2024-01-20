package io.github.johnchoi96.datastructure.binary_tree;

public class Node<E> {

    private Node<E> left;

    private Node<E> right;

    private final E data;

    public Node(E data) {
        this.data = data;
    }

    public Node(E data, Node<E> left) {
        this(data);
        this.left = left;
    }

    public Node(E data, Node<E> left, Node<E> right) {
        this(data);
        this.left = left;
        this.right = right;
    }

    public Node<E> getLeft() {
        return left;
    }

    public Node<E> getRight() {
        return right;
    }

    public E getData() {
        return data;
    }
}
