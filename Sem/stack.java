//stack
/*stack is a class that extends the super class vector.
 *stack is a class that implements stack data structure of LIFO order.
 *it has all the method of vector class and additonal methods for LIFO implementation
 *methods include push(),pop(),peek()
 */
import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack <String> s=new Stack<>();
        s.push("hello");
        s.push("boy");
        s.push("hola");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
