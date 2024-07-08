package assign;
import java.util.Scanner;


public class sumOddNumbers {
    public static int sum(int n)
    {
        int total=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                total=total+i;
            }
        }
        return total;

    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println(sum(n));
    }
}
