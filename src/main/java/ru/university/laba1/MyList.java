package ru.university.laba1;

public interface MyList<T> {

    public void add(T data);
    public void insert(int index, T data);
    public boolean removeAllByData(T data);
    public T removeByIndex(int index);
    public boolean removeMElemFromN(int amount, int index);
    public T getByIndex(int index);
    public void printList();
    public void reverse();
    public void addAllFromN(MyList<T> list, int index);
    public int getSize();
}
