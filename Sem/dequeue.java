//dequeue
/*dequeue is double ended queue that allows insertion and deletion at both ends.
 *subinterface that extends the queue interface.
 *part of java collection framework
 *implemented on arraydequeue and linkedlistdequeue class
 */
import java.util.*;
public class dequeue {
    public static void main(String[] args) {
        ArrayDeque<String> a=new ArrayDeque<>();
        a.add("hello");
        a.add("boy");
        a.add("hola");
        System.out.println(a.peek());
        System.out.println(a.element());
        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
