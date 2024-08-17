//linkedlist
/*linked list implements list interface.
 *it is similar to arraylist that contains multiple items of same datatype.
 *similarly,elements can be inserted,deleted,manipulated using list methods.
 *does not contain duplicate items.
 *items are stored in contains that contains address of previous and next container.
 *doubly linked list is used.
 */
import java.util.*;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList <String> l=new LinkedList<>();
        l.add("hii");
        l.add("hola");
        l.add("amigo");
        System.out.println(l.size());
        l.add(3,"hihi");
        l.set(2,"boy");
        System.out.println("    "+l.get(2));
        System.out.println(l.contains("hola"));
        //traversing
        Iterator itr=l.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
