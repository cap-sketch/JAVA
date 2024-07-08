package assign;
import java.util.*;
public class menu_driven_program {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for(int i=0;;i++)
        {
          System.out.println("Add subjects(enter 1)\nif you are done(enter 0): ");
          int n=s.nextInt();
          if(n==0)
          break;
          if(n==1)
          {
            System.out.println("enter marks: ");
            int m=s.nextInt();
            if(m>=90)
            n=1;
            else if(m>=60 && m<=80)
            n=2;
            else if(m<60)
            n=3;
            switch(n){
                case 1:
                System.out.println("this is good");
                break;
                case 2:
                System.out.println("this is very good");
                break;
                case 3:
                System.out.println("this is very very good");
                break;
                default:
                System.out.println("invalid input"); 
            }
            
          }
          
        }
    }
}

