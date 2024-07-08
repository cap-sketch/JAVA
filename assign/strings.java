package assign;
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        //string declaration
        String name="Anmol";
        String lastname="pratap";
        //string concatenation
        String fullname=name+"@"+lastname;
        System.out.println(fullname);
        //length of string
        System.out.println(fullname.length());
        //character of string
        for(int i=0;i<fullname.length();i++)
        {
            System.out.print(" "+fullname.charAt(i));
        }
        //comparing strings
        String s1="hello";
        String s2="iello";
        System.out.println();
        if(s1.compareTo(s2)==0)
        {
            System.out.println("equal strings");
        }
        else
        {
            if(s1.compareTo(s2)>0)
            {
                System.out.println("s1 is larger");
            }
            else
            {
                System.out.println("s2 is larger");
            }
        }
        //substrings
        String a="hello anmol";
        String b=a.substring(6,a.length());
        System.out.println(b);
    }
}
