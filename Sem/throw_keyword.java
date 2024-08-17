import java.util.Scanner;

public class throw_keyword {
    public static void main(String[] args) {
        int a=5;
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        if(b==0)
        {
            throw new ArithmeticException("cannot divide ");
        }
        else
        {
            System.out.println(a/b);
        }
    }
    
}
