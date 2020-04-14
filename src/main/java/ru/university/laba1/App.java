package ru.university.laba1;

import ru.university.oldVersion.MyCollections;
import ru.university.oldVersion.MyList;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
      MyDoubleLinkedList<Integer> linkedList = new MyDoubleLinkedList<>();

      linkedList.add(1);
      linkedList.add(2);
      linkedList.add(3);
      linkedList.add(4);

      linkedList.insert(1, 9);
      linkedList.printList();

      System.out.println("\n");

      linkedList.remove(3);
      linkedList.printList();
    }
}
