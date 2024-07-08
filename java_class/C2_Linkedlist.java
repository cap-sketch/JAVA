package java_class;
import java.util.*;
public class C2_Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>(); //generic syntax
        LinkedList<Integer> l2=new LinkedList<>(); //cannot set initial capacity

        //adding elements
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l2.add(12);
        l2.add(13);
        l2.add(14);

        /*adding at the last and first */
        l1.addLast(55);
        l1.addLast(56);
        l1.addFirst(788);
       
        //adding two different LinkedList
        l1.addAll(0,l2);
        
        //adding at specific index
        l1.add(0, 5);
        l1.add(5,1);

        //printing LinkedList
        System.out.println(l1);

        //checking an element
        System.out.println(l1.contains(5));
        System.out.println(l1.contains(25));

        //indexof method to check elements at particular index
        System.out.println(l1.indexOf(1));

        //clearing the LinkedList
        l1.clear();
        
        //accessing each element
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
    }
}
