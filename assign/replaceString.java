package assign;
import java.util.Scanner;

public class replaceString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String org=sc.next();
        String result="";
        for(int i=0;i<org.length();i++)
        {
            if(org.charAt(i)=='e')
            {
                 result+='i';
            }
            else
            {
                result+=org.charAt(i);
            }
        }
        System.out.println(result);
    }
}
