package ru.university.laba1;

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
      displayWorkDeleteByIndex();
      displayWorkRemoveMElemFromN();
      displayWorkCrossList();
      displayWorkRemoveAllByData();
      displayWorkJoinUnique();
      displayWorkReverse();
      displayWorkAddAllFromN();
      displayWorkSwapPartByIndex();
      displayWorkAddConstNTimes();
    }

    static public void displayWorkRemoveMElemFromN() {
      MyList<Character> linkedListChar = null;

      System.out.println("========================================");
      System.out.println("remove M elements from N index");
      System.out.println("list of char:");
      linkedListChar = initChar(13);
      linkedListChar.printList();
      System.out.println("remove 4 elements from 3 index");
      linkedListChar.removeMElemFromN(4, 3);
      System.out.println("list after deleting:");
      linkedListChar.printList();
      System.out.println("========================================");
    }

    static public void displayWorkDeleteByIndex() {
      MyList<Integer> linkedListInt = null;

      System.out.println("========================================");
      System.out.println("Delet element by index");
      System.out.println("list of integers:");
      linkedListInt = initInt(10);
      linkedListInt.printList();
      System.out.println("delete 0 element");
      linkedListInt.removeByIndex(0);
      System.out.println("list after deleting:");
      linkedListInt.printList();
      System.out.println("delete 3 element");
      linkedListInt.removeByIndex(3);
      System.out.println("list after deleting:");
      linkedListInt.printList();
      System.out.println("========================================");
    }

    static public void displayWorkCrossList() {
      MyList<Integer> linkedListInt1 = initInt(6);
      MyList<Integer> linkedListInt2 = initInt(6);

      System.out.println("========================================");
      System.out.println("Join two lists in one in which odd elements is element from 1 list and even from 2 list");
      System.out.println("first list: ");
      linkedListInt1.printList();
      System.out.println("second list: ");
      linkedListInt2.printList();
      System.out.println("join lists");
      MyCollections.crossLists(linkedListInt1, linkedListInt2).printList();
      System.out.println("========================================");
    }

    static public void displayWorkRemoveAllByData() {
      MyList<Character> linkedListChar = new MyDoubleLinkedList<>(Arrays.asList('k', 'a', 'r', 'j', 'x', 'a', 's', 'q', 'a'));

      System.out.println("========================================");
      System.out.println("Remove all elemnts by data");
      System.out.println("list: ");
      linkedListChar.printList();
      System.out.println("remove 'a':");
      linkedListChar.removeAllByData('a');
      linkedListChar.printList();
      System.out.println("========================================");
    }

    static public void displayWorkJoinUnique() {
      MyList<Integer> linkedListInt1 = new MyDoubleLinkedList<>(Arrays.asList(9, 8, 3, 11, 5));
      MyList<Integer> linkedListInt2 = new MyDoubleLinkedList<>(Arrays.asList(3, 4, 7, 11, 1, 0, 2));

      System.out.println("========================================");
      System.out.println("Join two lists in one in which just unique elements");
      System.out.println("first list: ");
      linkedListInt1.printList();
      System.out.println("second list: ");
      linkedListInt2.printList();
      System.out.println("join lists");
      MyCollections.joinUnique(linkedListInt1, linkedListInt2).printList();
      System.out.println("========================================");
    }

    static public void displayWorkReverse() {
      MyList<Character> linkedListChar = initChar(11);

      System.out.println("========================================");
      System.out.println("Reverse list");
      System.out.println("list: ");
      linkedListChar.printList();
      System.out.println("reverse:");
      linkedListChar.reverse();
      linkedListChar.printList();
      System.out.println("========================================");
    }

    static public void displayWorkAddAllFromN() {
      MyList<Integer> linkedListInt1 = initInt(6);
      MyList<Integer> linkedListInt2 = initInt(7);

      System.out.println("========================================");
      System.out.println("Insert list into list from N index");
      System.out.println("first list: ");
      linkedListInt1.printList();
      System.out.println("second list: ");
      linkedListInt2.printList();
      System.out.println("Insert list from 3");
      linkedListInt1.addAllFromN(linkedListInt2, 3);
      linkedListInt1.printList();
      System.out.println("========================================");
    }

    static public void displayWorkSwapPartByIndex() {
      MyList<Integer> linkedListInt1 = initInt(13);

      System.out.println("========================================");
      System.out.println("Swap parts of list by element");
      System.out.println("list: ");
      linkedListInt1.printList();
      System.out.println("swap by 4 index");
      MyCollections.swapPartByIndex(linkedListInt1, 4).printList();
      System.out.println("========================================");
    }

    public static void displayWorkAddConstNTimes() {
      MyList<Character> linkedListInt1 = initChar(7);

      System.out.println("========================================");
      System.out.println("Add constant N times in the end of list");
      System.out.println("list: ");
      linkedListInt1.printList();
      System.out.println("Add 'Z' 5 times");
      linkedListInt1.addConstNTimes('Z', 5);
      linkedListInt1.printList();
      System.out.println("========================================");
    }

    static public MyList<Character> initChar(int size) {
      MyList<Character> result = new MyDoubleLinkedList<>();

      for (int i = 0; i < size; i++) {
        result.add((char)(((Math.random() * (90 - 64)) + 64)));
      }
      return result;
    }

    static public MyList<Integer> initInt(int size) {
    MyList<Integer> result = new MyDoubleLinkedList<>();
    Random random = new Random();

    for (int i = 0; i < size; i++) {
      result.add((int)((Math.random() * 9) + 1));
    }
    return result;
  }

}
