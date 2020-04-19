package ru.university.laba1.list;

import lombok.Setter;
import lombok.Getter;

public class Node<T> {
    @Getter @Setter T data;
    @Getter @Setter private Node<T> next;
    @Getter @Setter private Node<T> prev;

    public Node(T data) {
        this.data = data;
    }

    public Node(T elem, Node<T> next, Node<T> prev) {
        this.data = elem;
        this.next = next;
        this.prev = prev;
    }
}



