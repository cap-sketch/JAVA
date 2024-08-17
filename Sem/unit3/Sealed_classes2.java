package unit3;
//Sealed classes
/*In java,sealed class was introduced as preview feature in java 15 and became a standard feature in java 17.
 *sealed class is way of controlling the inheritance heirarchy of class or interface by specifying which classes can extend or implement them.
 *it is a controlled mechanism of inheritance heirarchy that prevent unauthorised extension and provides more secure and maintainable code.
 *used to enhance security and provide controlled flexiblity to java applications.
 syntax and usage--
 declared using sealed modifier .
 permits clause specifies the clasees that are permitted.
 example-public sealed class shape extends circle,rectange{
 }
 subclasses should be defined by exactly one of modifiers-
 final-cannot be extended
 sealed-can be extended by permitted subclasses
 nonsealed-can be extended by unknown classes
 */

sealed abstract class Vehicle permits Car ,Bike {
    abstract void run();
}
final class Car extends Vehicle{
    @Override
    public void run()
    {
        System.out.println("car is running");
    }
}
final class Bike extends Vehicle{
    @Override
    public void run()
    {
        System.out.println("bike is running");
    }
}

public class Sealed_classes2 {
    public static void main(String[] args) {
    Car c=new Car();
    c.run();
    Bike b=new Bike();
    b.run();    
}
    

}
