package assign;
import java.util.*;
public class searching{
    public static int hello(int x,int n,int array[])
    {
        for(int i=0;i<n;i++)
        {
            if(x==array[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         Scanner ob=new Scanner(System.in);
         System.out.println("enter no. of inputs: ");
         int n=ob.nextInt();
         System.out.println("enter the inputs: ");
         int array[]=new int[n];
         for(int i=0;i<n;i++)
         {
            array[i]=ob.nextInt();
         }
         System.out.println("enter the number to search: ");
         int x=ob.nextInt();
         int p=hello(x,n,array);
         if(p==-1)
         {
            System.out.println("element not found");
            return;
         }
         p++;
         System.out.println("the element is at "+p+" positon.");

    }
}
