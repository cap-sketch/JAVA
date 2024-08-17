//map
/*map is used to contain values associated with keys.
 * each key: value pair is considered as an entry.
 * keys are unique but values can be same.
 *            |map|
 *         |sortedmap|     HashMap
 *          treemap        LinkedHashMap
 */
//hashmap
import java.util.*;
public class map {
    public static void main(String[] args) {
        HashMap<Integer,String> h=new HashMap<>();
        h.put(1,"hello");
        h.put(2,"boy");
        h.put(3,"hey");
        System.out.println(h.containsKey(2));
        System.out.println(h.containsValue("hello"));
        for(int i=0;i<h.size();i++)
        {
            System.out.println(h.get(i));
        }

    }
}
