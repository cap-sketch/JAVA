package assign;

import java.util.Scanner;

public class assignment_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int count=0;
        StringBuilder n1=new StringBuilder();
        for(int i=0;i<n.length();i++)
        {
        
            char c=n.charAt(i);
            char c2=' ';
            if(i<n.length()-1)
            c2=n.charAt(i+1);
            if(c==c2)
            {
                count++;
            }
            int x=(int)c;
            if(x==32)
            {
                n1.append('.');
            }
            x=x-32;
            c=(char) x;
            n1.append(c);
        } 
        System.out.println(n1); 
        System.out.println("count of double letter sequence: "+count);
    }
    
}
