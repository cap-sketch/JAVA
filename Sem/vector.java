//vector 
/*vector is a class that implements list interface.
 *vector uses a reziable or dynamic array to store the data.
 *similar to arraylist,however it is synchronized in nature.
 *thus,it has all methods of collection framework and also have additional methods.
 */
import java.util.*;
public class vector {
    public static void main(String[] args) {
        Vector <String> v=new Vector<>();
        v.add("hey");
        v.add("boy");
        v.add("hola");
        System.out.println(v.size());
        v.add(2,"tada");
        v.set(1,"cheetah");
        System.out.println(v.get(2));
        System.out.println(v.contains("boy"));
        //travesing
        Iterator itr=v.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
