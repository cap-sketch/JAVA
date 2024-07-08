package java_class;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // String name=new String("anmol");
        // System.out.println(name);
        // //string is not a primitve data type 
        // //string is a class
        // //however it can be used as primitve data type
        // String name2="pratap";
        // System.out.println(name2);
        // Scanner sc=new Scanner(System.in);
        // String name3=sc.nextLine();
        // System.out.println(name3);
        // String full=name+name2; //concatenation
        // int l=full.length();
        // System.out.println(full+" "+l);
        // //accessing characters of string
        // for(int i=0;i<full.length();i++)
        // System.out.println(full.charAt(i));
        // //substring
        // System.out.println(full.substring(0, 5));
        
        String a="Helloboy";
        int l=a.length();
        System.out.println(l);
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a);
        //trimming string
        String b="    hello  ";
        System.out.println(b.trim()); 
        //substring
        System.out.println(a.substring(0));
        System.out.println(a.substring(2, 5));
        System.out.println(a.replace('l', 'p'));
        System.out.println(a.replace("He","le"));
        System.out.println(a.startsWith("H"));
        System.out.println(a.endsWith("boy"));
        for(int i=0;i<a.length();i++)
        {
            System.err.println(a.charAt(i));
        }
        //indexof 
        System.out.println(a.indexOf("bo"));
        System.out.println(a.indexOf("b",4));
    } 
}
