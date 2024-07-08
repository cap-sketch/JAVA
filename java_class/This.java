package java_class;
class A{
    //refers to current object
    void current(){
         System.out.println(this);
    }
    //JRE confuses with instance variable and local variable
    int a;
    A()
    {
        System.out.println("hello boy");
    }
    A(int a)
    {
        this();
        this.a=a;
    }
  
}

public class This {
    public static void main(String args[])
    {
        A a=new A();
        a.current();

        A a2=new A(50);
        System.out.println(a2.a);
    }
}
