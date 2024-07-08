package assign;
import java.nio.Buffer;
import java.util.Scanner;

public class countZeroes {
    public static void main(String[] args) {
        {
            String c;
            int pos=0;
            int neg=0;
            int zero=0;
            do{
                
                 System.out.println("enter the number: ");
                 Scanner s=new Scanner(System.in);
                 int x=s.nextInt();
                 if(x>0)
                 pos++; 
                 if(x==0)
                 zero++;
                 if(x<0)
                 neg++;                 
                 System.out.println("do you want to add another number(y/n):" );
                 c=s.next();
            }
            while(c.equals("y"));
            System.out.println("pos "+pos);
            System.out.println("zero "+zero);
            System.out.println("neg "+neg);
        }
    }
}
