//abstraction
/*-abstraction is a process of hiding the internal implementation of data and only showing the required things to user.
  -abstraction means only existing in thought not in concrete evidenence.
  -abstract methods-does not have defination
  -types-using abstract class(can have abstract and non abstract methods and instance variables.)
        -using interface(purely abstraction)
  -abstract class
    can have abstract as well as non abstracct methods.
    cannot be instantised.
    abstract methods are overriden in subclasees.
 */
package Sem;
//abstract class
abstract class Animal{
    abstract void sleeps();
    abstract void eat();
    abstract void walk();
    int b=5;
    void func()
    {
        System.out.println("i am an animal");
    }
}

class Dog extends Animal{
    public void sleeps()
    {
        System.out.println("dog is sleeping");
    }
    public void eat()
    {
        System.out.println("dog is eating");
    }
    public void walk()
    {
        System.out.println("dog is walking");
    }
}

public class AbstractClasses{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sleeps();
        d.eat();
        d.walk();
        d.func();
    }
}
