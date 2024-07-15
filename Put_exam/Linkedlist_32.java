package Put_exam;
import java.util.*;
public class Linkedlist_32 {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(3,8);
        System.out.println(l.size());
        System.out.println(l.contains(5));
        System.out.println(l.get(0));
        Iterator<Integer> iter=l.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        l.remove(0);
        l.clear();
    }
}
