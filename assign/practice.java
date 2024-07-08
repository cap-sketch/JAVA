package assign;
class hello{
    int a;
    int b;
    public void func()
    {
        System.out.println("the sum is "+ (a+b));
    }
}

public class practice {
    public static void main(String args[])
    {
        hello h=new hello();
        h.a=5;
        h.b=6;
        h.func();
    }
}
