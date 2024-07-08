package java_class;     //user defined package
import java.util.*;    //inbuilt package
class Shape{
    void area()
    {
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
       void area(int l,int h)
       {
        System.out.println((2)*l*h);
       }
}
class Equilateral extends Triangle
{
    void area(int l,int h)
    {
        System.out.println("area is found");
    }
}

class circle extends Shape{
    void area()
    {
        System.out.println("area of circle");
    }
}
public class ooPS2 {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.area(4,5);
        
    }
}


//inheritance
//the properties and functions can be used from one class
                       //to another class.
   //types-4
    //-single level(base-->derived)
    //-multilevel (base--->derived--->more derived)
    //-heirachial(base--->multi derived classes)
    //-hybrid inheritance(single+multi+herirachial)mixed form

//access modifiers
// --default--can access by any class but only same package
// --public-- can access by any class or package
// --private--cannot access outside class or subclass(getters and setters functions are used to use)
// --protected--can be access by subclasses of other package
    //          or any class within current package


//encapsulation
//making a container of things
//like class contains functions and data
//allow data hiding using encapsulation
