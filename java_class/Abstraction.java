package java_class;

abstract class Animals         //it is just a standard without an implementation.
{                    //it is hidden from the user but can be referenced.
   abstract void walk();
}
class Dog extends Animals{
    void walk()
    {
        System.out.println("walks on 4 legs");
    }
}
class human extends Animals{
    void walk()
    {
        System.out.println("walk on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
      Dog d=new Dog();
      d.walk();
    }
}
