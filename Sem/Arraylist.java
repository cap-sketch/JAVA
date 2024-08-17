//arraylist
/*arraylist is a resizable array or dynamic array.
 *it is same as an array but it does not have a fixed size.
 *it contains a simple array,if element is needed to be added and space is not enough,a new array is created.
 *random access to elements.
 *implements list interface.
 */
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList <String> al=new ArrayList<>();     
        al.add("hello");
        al.add("boy");
        al.add("how");
        al.add("doing");                              //add at the end of list
        al.add(3,"hey");                  //add element at particular index
        al.set(3,"hiy");                  //replaces obj at index
        System.out.println("   "+al.get(3));     //return obj at index
        al.remove(3);                            //delete obj at index
        System.out.println(al.size());
        System.out.println(al.contains("doing"));
        //traversing using iterator
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
