package ru.university.laba1;

import java.util.Collections;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
      MyDoubleLinkedList<Integer> linkedList = new MyDoubleLinkedList<>();
      MyDoubleLinkedList<Integer> linkedList2 = new MyDoubleLinkedList<>();

      linkedList.add(1);
      linkedList.add(2);
      linkedList.add(3);
      linkedList.addConstNTimes(1, 10);
//      linkedList2.add(11);
//      linkedList2.add(12);
//      linkedList2.add(13);
//      linkedList2.add(14);
//      linkedList.reverse();
      linkedList.printList();

//      linkedList.addAllFromN(linkedList2, 3);
//      linkedList.printList();

//        MyList<Integer> result = MyCollections.swapPartByIndex(linkedList, 0);
//        result.printList();

//      MyList<Integer> result = MyCollections.joinUnique(linkedList, linkedList2);
//      result.printList();

//      linkedList.insert(1, 9);
//      linkedList.printList();
//
//      System.out.println("\n");
//
//      linkedList.removeMElemFromN(9, 0);
//      linkedList.printList();
//
      System.out.println("head: " + linkedList.getHead().getData());
      System.out.println("tail: " + linkedList.getTail().getData());
      System.out.println("size: " + linkedList.getSize());
    }
}
