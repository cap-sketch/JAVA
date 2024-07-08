package assign;

import java.util.Scanner;

public class String_experiment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the text: ");
        String n=sc.next();
        for(int i=0;i<n.length();i++)
        {
            int x=n.charAt(i);
            int y=n.charAt(i+1);
            if(y-x==1)
            {
                System.out.println("Yes");
                break;
            }
            else
            {
                System.out.println("NO");
                break;
            }
        }
    }
    
}
