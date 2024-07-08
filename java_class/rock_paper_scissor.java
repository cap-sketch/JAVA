package java_class;

import java.util.*;

public class rock_paper_scissor {
    public static void main(String args[])
    {
        char c;
     do{
           
        System.out.println("0 for rock,1 for paper,2 for scissor: ");
        
        //user choice
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur choice: ");
        int n=sc.nextInt();

        //computer choice
        Random random=new Random();
        int m=random.nextInt(3);

        if(n==m)
        {
            System.out.println("Draw");
        }
        else if(n==0 && m==2 || n==1 && m==0 || n==2 && m==1)
        {
            System.out.println("you won");
        }
        else
        {
            System.out.println("computer won");
        }
        System.out.println("do you want to play more(y/n): ");
            c=sc.next().charAt(0);

     }while(c=='y');
    }
}
