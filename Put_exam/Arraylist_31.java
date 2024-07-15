package Put_exam;
import java.util.*;
//Arraylist is a resizable array that uses a dynamic array
// and the arraylist class is in java.util collection.
public class Arraylist_31{
    public static void main(String args[])
    {
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(5);
        ar.add(6);
        ar.add(3);
        ar.add(4);
        Collections.sort(ar);
        Iterator<Integer> iter=ar.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        ar.add(2,8);
        System.out.println(ar.size());
        System.out.println(ar.contains(8));
        
        ar.remove(0);
        ar.clear();
    }
}
