package java_class;

import java.util.ArrayDeque;

public class C3_ArrayDequeue {
    public static void main(String[] args) {
        //array with insertion and deletion at both ends
        ArrayDeque<Integer> a1=new ArrayDeque<>();
        //adding elements
        a1.add(6);
        a1.add(7);
        a1.add(8);
        a1.add(9);

        //get first and last element
        System.out.println(a1.getFirst());
        System.out.println(a1.getLast());

        /*adding at the last and first */
        a1.addLast(55);
        a1.addLast(56);
        a1.addFirst(788);

        //printing LinkedList
        System.out.println(a1);

        //checking an element
        System.out.println(a1.contains(6));
        System.out.println(a1.contains(25));

        //clearing the LinkedList
        a1.clear();
        
    }
}
