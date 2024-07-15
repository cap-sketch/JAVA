package Put_exam;

import java.util.*;

public class Stack_32 {
    public static void main(String[] args) {
        Stack<String> str=new Stack<>();
        str.push("hello");
        str.push("boy");
        str.peek();
        str.pop();
        str.empty();
        Iterator<String> iter=str.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}
