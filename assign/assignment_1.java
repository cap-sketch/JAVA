package assign; //just a folder

import java.util.Scanner;

public class assignment_1 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the text: ");
        String n=ob.nextLine();
        if(n.charAt(0)!='x' && n.charAt(0)!='y')
        {
        n=n.substring(1);
        if(n.charAt(0)!='x' && n.charAt(0)!='y')
        {
            n=n.substring(1);
        }
        }
        else{
            if(n.charAt(1)!='x' && n.charAt(1)!='y')
            {
                n=n.substring(0,1)+n.substring(2);
            }
        }
        System.out.println(n);
    }
}
