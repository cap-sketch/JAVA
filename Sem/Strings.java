//string is a sequence of characters
//string is a class that can be used as a datatype.
import java.util.*;
public class Strings {
    public static void main(String args[])
    {
        String name=new String("Anmol");
        String name2="pratap";
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.startsWith("Hey"));
        System.out.println(s.endsWith("boy"));
        System.out.println(s.trim());
        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }
        System.out.println(s.indexOf("boy"));
        System.out.println(s.substring(2,5));
        System.out.println(s.replace("boy","toy"));
        System.err.println(s.equals("Hey toy"));

    }
}

//strings are immutable meaning it cannot be changed after creation.