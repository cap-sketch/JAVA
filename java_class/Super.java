package java_class;
class Aa{
    int a=5;
     Aa()
     {
       System.out.println("hey");
     }
}
class B extends Aa{
    int a=10;
    B()
    {
        super();  //added automatically to add super class constructor
        System.out.println("i am a constructor");
        System.out.println(super.a);
    }
    
}
public class Super {
    public static void main(String[] args) {
        B b=new B();
        
    }
}
