//collections
/*-collections in java is a framework that provides an architecture to store and manipulate group of objects.
 *-java collection can achieve all operations that you can perform on data such as searching,sorting,inserting,manipulating,deleting,etc.
 *-java collection is single unit of objects.
 *-collection contains interfaces(list,set,queue) and classes(arrraylist,linkedlist,vector,priorityqueue).
 */

 //collection heirarchy
 //java.util package contains all classes and interfaces of collection framework.
 /*
             |iterable|
             |collections|
    |List|       |queue|          |set|
    arraylist      priorityqueue      Hashset
    linkedlist   |dequeue|            linkedhashset
    vector       arraydequeue      |sortedset|
    stack                           treeset
  */
//iterable
/*-iterable is a root interface which is implemented to all classes of collection framework.
 *-collection framework extends iterable interface so all subclasses also inherit the iterable interface.
 -contains one abstract method iterator()
//collections
/*-collection is an interface that act as a fundamental interface to all classes of collection framework.
 *-collection methods such as add(obj),addAll(collection),clear() implement to all classes.
 */
//List
/*list is a child interface of collection interface.
 *list is a list data type that contains an ordered collection of data
 *data in list can be indexed
 *list are resizable in nature.
 */
//arraylist
/*arraylist is a resizable array or dynamic array.
 *it is same as an array but it does not have a fixed size.
 *it contains a simple array,if element is needed to be added and space is not enough,a new array is created.
 *random access to elements.
 *implements list interface.
 */

public class Collections {
    public static void main(String[] args) {
                
    }
}
