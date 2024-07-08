package assign;
import java.util.*;
public class sum_natural_even_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int count=0;
        for(int i=1;;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
                count++;
            }
            if(count==n)
            break;
        }
        System.out.println(sum);
    }
}
