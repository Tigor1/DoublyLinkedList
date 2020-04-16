# Doubly linked list

In this project, I study how the doubly linked list works. I wrote my implementation of this data structure in java.
and did the task that was given at the university.

### About doubly linked list

A doubly linked list whose nodes contain three fields: the link to the previous node, an integer value, and the link to the next node.
There is also reference to head and tail of list. It is possible to iterate over a doubly linked list in both directions starting from head or tail because every node has prev and next references.

![doubleLinkedLIST](https://cdn.softwaretestinghelp.com/wp-content/qa/uploads/2019/06/A-basic-layout-of-the-doubly-linked-list.png)

Adding and removing elements from any part of the list is faster and more efficient then array. Retrieval is slower as the list has to traverse through each node to identify the correct one.

##### Description node in java code

```
public class Node<T> {
     T data;
     private Node<T> next;
     private Node<T> prev;
 
     ....
 }
``` 

### University tasks

| № | task | completed |
|---|------|:-----------:|
| 4 |   Написать программу удаления N-ого в списке.   |+|
| 5 |   Написать программу удаления M элементов из списка, начиная с N-ой позиции.   |+|
| 6 |   Написать программу объединения двух списков в третий так, чтобы нечетные(по номеру) элементы были из первого списка, четные из второго.   |+|
| 12 |   Написать программу удаления из списка всех вхождений заданного элемента.   |+|
| 14 |   Написать программу объединения двух списков в третий так, чтобы одинаковые элементы изразных списков не повторялись.   |+|
| 15 |   Написать программу инвертирование списка.   |+|
| 16 |   Написать программу вставки в список другого списка, начиная с N-й позиции.   |+|
| 26 |   написать программу разделения исходного списка по N-му элементу и соединения полученных частей в новыйи список таким образом, чтобы первая часть стала второй, а вторая - первой.   |+|
| 30 |   написать программу дописывания заданной константы N раз в конец списка. |+|


