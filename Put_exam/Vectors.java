package Put_exam;
import java.util.*;
//Vectors uses dynamic array just like Arraylist
//however,it is synchronized in nature.
//and it has many methods beyond collections.
public class Vectors{
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(4);
        v.add(1,6);
        System.out.println(v.size());
        System.out.println(v.contains(6));
        System.out.println(v.get(0));
        Iterator<Integer> iter=v.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        v.remove(0);
        v.clear();

    }
}
