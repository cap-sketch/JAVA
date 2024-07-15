package Put_exam;

public class Static {
    //static variable 
    static int a=5;
    static{
        int b=5;
        System.out.println(b);
    }
    public static void main(String args[])
    {
        System.out.println(a);
        Static.a=6;
        System.out.println(a);
        Static.func();
    }
    static void func()
    {
        System.out.println("i am static method");
    }
}
