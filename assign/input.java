package assign;
import java.util.*;
public class input {
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    int age=s.nextInt();
    if(age>=18)
    {
        System.out.println("Adult");
    }
    else{
        System.out.println("not an Adult");
        
    }
}

}
