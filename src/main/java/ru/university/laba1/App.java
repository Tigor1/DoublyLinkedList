package ru.university.laba1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
      MyList<Integer> list = new MyList<>(new LinkedList<>());

      list.add(1);
      list.add(1);
      list.add(1);
      list.add(1);
      list.add(1);
      list.add(7);
      list.add(2);
      MyList<Integer> result = MyCollections.swapPartByIndex(list, 5);
      result.printAll();
    }
}
