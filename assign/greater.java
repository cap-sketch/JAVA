package assign;
import java.util.Scanner;

public class greater {
    public static int great(int a,int b)
    {
        if(a>=b)
        return a;
        return b;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
        System.out.println(great(a,b));
    }
}
