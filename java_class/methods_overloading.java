package java_class;

public class methods_overloading {
    static void foo()
    {
        System.out.println("good morning bro");
    }
    static void foo(int a)
    {
        System.out.println("good morning bro "+a);
    }
    public static void main(String[] args) {
        foo();
        foo(15);
    }
}
