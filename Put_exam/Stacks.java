package Put_exam;
import java.util.*;
//stack is a class that extends vector class and implements list.
//LIFO mechanism is followed.
//push,pop,peek
public class Stacks{
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(5);
        s.push(6);
        System.out.println(s.peek()); //shows uppermost
        s.pop();
        Iterator<Integer> iter=s.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}
