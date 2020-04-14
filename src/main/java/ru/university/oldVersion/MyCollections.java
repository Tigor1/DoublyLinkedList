package ru.university.oldVersion;

import java.util.*;

public class MyCollections {

    //Вариант №6
    static public <T> MyList<T> join(MyList<T> list1, MyList<T> list2) {
        MyList<T> result = new MyList<>(new ArrayList<>());

        int minSize = Math.max(list1.size(), list2.size());

        for (int i = 0; i < minSize; i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));
        }

        if (list1.size() > minSize) {
            for (int i = minSize; i < list1.size(); i++)
                result.add(list1.get(i));
        }

        if (list2.size() > minSize) {
            for (int i = minSize; i < list2.size(); i++)
                result.add(list2.get(i));
        }
        return result;
    }

    //Вариант №13
    static public <T> MyList<T> joinUnique(MyList<T> list1, MyList<T> list2) {
        Set<T> set = new HashSet<>();

        for (int i = 0; i < list1.size(); i++)
            set.add(list1.get(i));

        for (int i = 0; i < list2.size(); i++)
            set.add(list2.get(i));

        return new MyList<>(new ArrayList<>(set));
    }

    //Вариант №26
    static public <T> MyList<T> swapPartByIndex(MyList<T> list, int index) {
        if (index > list.size() - 1) return null;

        List<T> tmp = new LinkedList<>();

        for (int i = index + 1; i < list.size(); i++) {
            tmp.add(list.get(i));
        }
        tmp.add(list.get(index));

        for (int i = 0; i < index; i++) {
            tmp.add(list.get(i));
        }

        return new MyList<>(tmp);
    }
}
