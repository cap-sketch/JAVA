//queue
/*queue is an interace that is available in java.util package.
 *queue is an interface that extends the collection interface.
 *it follows the fifo principle.
 *can contain duplicate elements.
 */
//priority queue
/*priority queue is a queue in which elements are processed as per priority.
 *the element with highest ascii value given will have highest priority.
 */
import java.util.*;
public class queue {
    public static void main(String[] args) {
        PriorityQueue<String> p=new PriorityQueue<>();
        p.add("hello");
        p.add("hola");
        p.add("boy");
        System.out.println(p.element());
        p.remove();
        Iterator itr=p.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
