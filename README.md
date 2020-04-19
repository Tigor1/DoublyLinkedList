# Doubly linked list

In this project, I study how the doubly linked list works. I wrote my implementation of this data structure in java
and did the task that was given at the university.

### About doubly linked list

A doubly linked list node contains three fields: the link to the previous node, an data, and the link to the next node.
There is also link to head and tail of list. It is possible to iterate over a doubly linked list in both directions starting from head or tail because every node has prev and next references.

![doubleLinkedLIST](https://cdn.softwaretestinghelp.com/wp-content/qa/uploads/2019/06/A-basic-layout-of-the-doubly-linked-list.png)


### Comparison whith array

| BASIS FOR COMPARISON |  ARRAY |  LINKED LIST |
|:----------------------:|--------|--------------|
|Size|	Specified during declaration.|	No need to specify; grow and shrink during execution.|
|Storage Allocation|	Element location is allocated during compile time.|	Element position is assigned during run time.|
|Accessing the element|	Direct or randomly accessed, i.e., Specify the array index or subscript.|	Sequentially accessed, i.e., Traverse starting from the first node in the list by the pointer.|
|Insertion and deletion of element|	Slow relatively as shifting is required.|	Easier, fast and efficient.|
|Searching|	Binary search and linear search|	linear search|
|Memory required|	less|	More|
|Memory Utilization|	Ineffective|	Efficient|

### Description node in java code

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
| 4 |  удаления N-ого в списке.   |+|
| 5 |  удаления M элементов из списка, начиная с N-ой позиции.   |+|
| 6 |  объединения двух списков в третий так, чтобы нечетные(по номеру) элементы были из первого списка, четные из второго.   |+|
| 12 |  удаления из списка всех вхождений заданного элемента.   |+|
| 14 |  объединения двух списков в третий так, чтобы одинаковые элементы изразных списков не повторялись.   |+|
| 15 |  инвертирование списка.   |+|
| 16 |  вставки в список другого списка, начиная с N-й позиции.   |+|
| 26 |  разделения исходного списка по N-му элементу и соединения полученных частей в новыйи список таким образом, чтобы первая часть стала второй, а вторая - первой.   |+|
| 30 |  дописывания заданной константы N раз в конец списка. |+|

### Build and run project

You need [git](https://git-scm.com/), [maven](https://maven.apache.org/index.html), [jdk](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) to build this project.

```
git clone https://github.com/Tigor1/DoublyLinkedList.git DoublyLinkedList
cd DoublyLinkedList
mvn package
cd target
java -jar doublyLinkedList-1.0-SNAPSHOT.jar
```


