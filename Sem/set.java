//set
/*set is an interface available in java.util package.
set is an interface extending the collection interface.
set is a unordered collection of data that does not allow duplicate elements. 
implements-hashset and linkedhashset
extends the sortedset interface that implements treeset*/
//hashset
/*hashset is a set class that implements the set interface.
 *it uses the hashtable to store elements due to which insertion,del operation occurs in constant time.
 *set is unordered collection of elements in which duplicate elements are not allowed.
 */
//linkedhashset
/*it is ordered version of hashset
 * linkedlist+hashtable+set
 */
//sortedset-it is used to store the elements of set in sorted order.
import java.util.*;
public class set {
    public static void main(String[] args) {
        LinkedHashSet<String> s=new LinkedHashSet<>();
        s.add("hello");
        s.add("hola");
        System.out.println(s.size());
        System.out.println(s.contains("hola"));
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        s.clear();
    }
}
