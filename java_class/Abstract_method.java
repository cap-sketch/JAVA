package java_class;
abstract class Parent1{
    Parent1()
    {
        System.out.println("i am base constructor");
    }
    public void sayhello()
    {
        System.out.println("hello");
    }
    abstract public void greet();
}
class child2 extends Parent1{
    @Override
    public void greet()
    {
        System.out.println("good morning");
    }

}

public class Abstract_method {
    public static void main(String[] args) {
        
    }
    
}
