package ru.university.laba1;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class MyDoubleLinkedList<T> implements MyList<T>{
    @Getter private Node<T> head;
    @Getter private Node<T> tail;
    @Getter private int size;

    public MyDoubleLinkedList() {
        size = 0;
    }

    public MyDoubleLinkedList(Collection<T> collection) {
        for (T item : collection) {
            add(item);
        }
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

    //вариант 12
    public boolean removeAllByData(T data) {
        Node<T> current = head;
        boolean isDelet = false;

        while (current != null) {
            if (current.getData() == data) {
                if (current.getNext() != null)
                    current.getNext().setPrev(current.getPrev());
                if (current.getPrev() != null)
                    current.getPrev().setNext(current.getNext());
                if (current == head)
                    head = current.getNext();
                if (current == tail)
                    tail = current.getPrev();
                size--;
                isDelet = true;
            }
            current = current.getNext();
        }
        return isDelet;
    }

    public T getByIndex(int index) {
        if (index > size - 1) return null;
        Node<T> current = head;

        for (int i = 1; i <= index; i++)
            current = current.getNext();
        return current.getData();
    }

    //Вариант №4
    public T removeByIndex(int index) {
        if (index > size - 1) return null;

        Node<T> current = head;
        for (int i = 1; i <= index; i++)
            current = current.getNext();
        if (current.getPrev() != null)
            current.getPrev().setNext(current.getNext());
        if (current.getNext() != null)
            current.getNext().setPrev(current.getPrev());
        if (current == head)
            head = current.getNext();
        if (current == tail)
            tail = current.getPrev();
        current.setNext(null);
        current.setPrev(null);
        size--;
        return current.getData();
    }

    //Вариант №5
    public boolean removeMElemFromN(int amount, int index) {
        if (amount + index > size) return false;

        Node<T> current = head;
        for (int i = 1; i <= index; i++)
            current = current.getNext();
        for (int i = 0; i < amount; i++) {
            if (current.getPrev() != null)
                current.getPrev().setNext(current.getNext());
            if (current.getNext() != null)
                current.getNext().setPrev(current.getPrev());
            if (current == head)
                head = current.getNext();
            if (current == tail)
                tail = current.getPrev();
            current = current.getNext();
            size--;
        }
        return true;
    }

    //Вариант №16
    public void addAllFromN(MyList<T> list, int index) {
        if (index > size || list.getSize() == 0) return;

        Node<T> current = head;

        for (int i = 1; i < index; i++)
            current = current.getNext();
        if (index != 0) {
            for (int i = 0; i < list.getSize(); i++) {
                Node<T> newNode = new Node<>(list.getByIndex(i));

                newNode.setNext(current.getNext());
                newNode.setPrev(current);
                if (current.getNext() != null)
                    current.getNext().setPrev(newNode);
                current.setNext(newNode);
                if (current == tail)
                    tail = newNode;
                current = current.getNext();
                size++;
            }
        } else {
            Node<T> newHead = new Node<>(list.getByIndex(0));
            Node<T> cur = newHead;
            size++;

            for (int i = 1; i < list.getSize(); i++) {
                Node<T> newNode = new Node<>(list.getByIndex(i));

                cur.setNext(newNode);
                newNode.setPrev(cur);
                cur = newNode;
                size++;
            }
            cur.setNext(head);
            head.setPrev(cur);
            head = newHead;
        }
    }

    //Вариант 15
    public void reverse() {
        Node<T> currentTail = tail;
        Node<T> currentHead = head;

        for (int i = 0; i < size / 2; i++) {
            swap(currentHead, currentTail);
            currentHead = currentHead.getNext();
            currentTail = currentTail.getPrev();
        }
    }

    private void swap(Node<T> node1, Node<T> node2) {
        T tmp = node1.getData();
        node1.setData(node2.getData());
        node2.setData(tmp);
    }

    //Вариант 30
    public void addConstNTimes(T data, int amount) {
        Node<T> current = tail;

        for (int i = 0; i < amount; i++) {
            Node<T> newNode = new Node<>(data);

            current.setNext(newNode);
            newNode.setPrev(current);
            current = current.getNext();
            size++;
        }
        tail = current;
    }

    public void printList() {
        Node<T> current = head;

        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
