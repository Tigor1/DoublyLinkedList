package ru.university.laba1;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lombok.*;



public class MyList<T> {
    @Getter @Setter private List<T> list;

    public MyList(List<T> list) {
        this.list = list;
    }

    public void add(T elem) {
        list.add(elem);
    }

    //Вариант №4
    public T removeElement(int index) {
        return list.remove(index);
    }

    //Вариант №5
    public boolean removeMElementStartN(int m, int index) {

        if (index + m - 1 < list.size()) {
            for (int i = index; i < m; i++)
                removeElement(i);
        } else
            return false;
        return true;
    }

    //Вариант №12
    public boolean removeElement(T elem) {
       return list.removeIf(t -> t == elem);
    }

    //вариант №15
    public void reverse() {
        for (int i = 0; i < list.size() / 2; i++)
            Collections.swap(list, i, list.size() - i - 1);
    }

    //Вариант №16
    public boolean addFromN(MyList<T> beingAdded, int n) {
        if (n <= list.size()) {
            for (int i = 0; i < beingAdded.size(); i++) {
                list.add(n + i, beingAdded.get(i));
            }
        } else
            return false;
        return true;
    }

    //Вариант №19
    public int frequence(T elem) {
        return Collections.frequency(list, elem);
    }

    //Вариант №23
    public void replaceEvenFromN(T cons, int n) {
        for (int i = n; i < list.size(); i++) {
            if (i % 2 != 0)
                list.set(i, cons);
        }
    }

    public T get(int i) {
        return list.get(i);
    }

    public int size() {
        return list.size();
    }

    public void printAll() {
        list.forEach(System.out::println);
    }
}
