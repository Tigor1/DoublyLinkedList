package ru.university.laba1;

import lombok.Getter;
import lombok.Setter;

public class MyDoubleLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    @Getter private int size;


    public MyDoubleLinkedList() {
        size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }

    public void insert(int index, T data) {
        if (index > size) return;
        if (index == size) { add(data); return;}
        Node<T> newNode = new Node<>(data);

        if (index == 0) {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
            return;
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        if (current.getPrev() != null)
            current.getPrev().setNext(newNode);
        newNode.setPrev(current.getPrev());
        newNode.setNext(current);
        current.setPrev(newNode);
        size++;
    }

    public T remove(T data) {
        Node<T> current = head;

        while (current.getNext() != null) {
            if (current.getData() == data) {
                if (current.getNext() != null)
                    current.getNext().setPrev(current.getPrev());
                if (current.getPrev() != null)
                    current.getPrev().setNext(current.getNext());
                current.setNext(null);
                current.setPrev(null);
                size--;
                return current.getData();
            }
            current = current.getNext();
        }
        return null;
    }

    public void printList() {
        Node<T> current = head;

        while (current.getNext() != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
        System.out.println(current.getData());
    }

}
