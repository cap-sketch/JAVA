package assign;
import java.util.Scanner;

public class circumference {
    public static double circum(double r)
    {
        double c=2*3.14*r;
        return c;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        double r=ob.nextFloat();
        System.out.println(circum(r));
    }
}
