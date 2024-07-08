package java_class;

import java.util.Date;

public class Date_time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        long a=System.currentTimeMillis();
        System.out.println(Long.MAX_VALUE);
        System.out.println(a);
        
        //date class
        Date n=new Date(); //can have multiple constructors
        System.out.println(n);
        System.out.println(n.getTime());
        System.out.println();

    }
}
