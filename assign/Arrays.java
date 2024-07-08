package assign;
import java.util.Scanner;

public class Arrays {
    public static void printer(int n,int marks[])
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(marks[i]);
        }
    }
    public static void main(String[] args) {
        {
            int marks[]=new int [5];
            int n=5;
            System.out.println("enter your marks: ");
            Scanner ob=new Scanner(System.in);
            for(int i=0;i<5;i++)
            {
                marks[i]=ob.nextInt();
            }
            printer(n,marks);
        }
    }
}
