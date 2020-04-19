package ru.university.laba1.list;

public interface MyList<T> {

    void add(T data);
    void insert(int index, T data);
    boolean removeAllByData(T data);
    T removeByIndex(int index);
    boolean removeMElemFromN(int amount, int index);
    T getByIndex(int index);
    void printList();
    void reverse();
    void addAllFromN(MyList<T> list, int index);
    int getSize();
    void addConstNTimes(T data, int amount);
}
