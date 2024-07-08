package assign;
import java.util.Scanner;

public class email {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String mail=sc.next();
       String result="";
       for(int i=0;i<mail.length();i++)
       {
          if(mail.charAt(i)!='@')
          {
            result+=mail.charAt(i);
          }
          else
          {
            break;
          }
       }
       System.out.println(result);
    }
}
