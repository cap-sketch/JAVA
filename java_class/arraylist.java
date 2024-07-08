package java_class;
import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
         ArrayList<Integer> list=new ArrayList<>();
         
         //adding elements
         list.add(5);
         list.add(6);
         list.add(7);

         //getting elements
         int e=list.get(0);
         System.out.println(e);
         
         //adding inbetween
         list.add(1,4);
         System.out.println(list);
         
         //set element(change element at any pos)
         list.set(1, 7);
         System.out.println(list);
         
         //delete element
         list.remove(3);
         System.out.println(list);
         
         //count size of arraylist
          int l=list.size();
          System.out.println(l);
         
         //loops
         for(int i=0;i<list.size();i++)
         {
            System.out.print(list.get(i));
         }
         //sorting 
         Collections.sort(list);
         //collections is a class that have a sort function
         System.out.println(list);
    }
}
