package ru.university.laba1.Collections;

import ru.university.laba1.list.MyDoubleLinkedList;
import ru.university.laba1.list.MyList;

import java.util.*;

public class MyCollections {
    //Вариант 6
    static public <T> MyList<T> crossLists(MyList<T> list1, MyList<T> list2) {
        MyList<T> result = new MyDoubleLinkedList<>();

        int minSize = Math.min(list1.getSize(), list2.getSize());

        for (int i = 0; i < minSize; i++) {
            result.add(list1.getByIndex(i));
            result.add(list2.getByIndex(i));
        }

        if (list1.getSize() > minSize) {
            for (int i = minSize; i < list1.getSize(); i++)
                result.add(list1.getByIndex(i));
        }

        if (list2.getSize() > minSize) {
            for (int i = minSize; i < list2.getSize(); i++)
                result.add(list2.getByIndex(i));
        }

        return result;
    }

    //Вариант №13
    static public <T extends Comparable<T>> MyList<T> joinUnique(MyList<T> list1, MyList<T> list2) {
        Set<T> set = new LinkedHashSet<>();

        for (int i = 0; i < list1.getSize(); i++)
            set.add(list1.getByIndex(i));

        for (int i = 0; i < list2.getSize(); i++)
            set.add(list2.getByIndex(i));

        return new MyDoubleLinkedList<>(set);
    }

    //Вариант 26
    static public <T> MyList<T> swapPartByIndex(MyList<T> list, int index) {
        if (index > list.getSize() - 1) return null;

        List<T> tmp = new ArrayList<>();

        for (int i = index + 1; i < list.getSize(); i++) {
            tmp.add(list.getByIndex(i));
        }
        tmp.add(list.getByIndex(index));

        for (int i = 0; i < index; i++) {
            tmp.add(list.getByIndex(i));
        }

        return new MyDoubleLinkedList<>(tmp);
    }
}
