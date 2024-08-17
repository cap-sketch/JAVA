//Inheritance
/*-inheritance is a one of the most important functionality of object oriented programming language.
  -inheritance is an act of deriving new things from existing things.
  -inheritance is a mechanism through which a subclass inherits the properties and behaviour of a super class.
  -it forms a parent-child relationship.
  -extends keyword is used to inherit another class.
  -why--achieve method overriding(runtime polymorphism),code reusablity
  types-single level,multilevel,heirachial
  multiple inheritance not supported in java.
 */
package Sem;
//single level inheritance
// class employee{
//     int salary=5000;
// }
// class programmer extends employee{
//     void func()
//     {
//         System.out.println("i am a programmer with salaray: "+salary);
//     }
// }
// public class inheritance {
//     public static void main(String args[])
//     {
//         programmer p=new programmer();
//         p.func();
//     }
// }


//multilevel inheritance is a chaining inheritance where  a class have a subclass and subclass have another subclass extending .
// class Animal{
//     void eat()
//     {
//         System.out.println("i eat food...");
//     }
// }

// class Dog extends Animal{
//     void bark()
//     {
//         System.out.println("i do barking....");
//     }
// }

// class babydog extends Dog{
//     void cry()
//     {
//         System.out.println("i am crying..");
//     }
// }

// public class inheritance{
//     public static void main(String args[])
//     {
//         babydog b=new babydog();
//         b.cry();
//         b.bark();
//         b.eat();
//     }
// }

//heirachial inheritance is the a class having multiple subclasses 
class Animal{
    void eat()
    {
        System.out.println("i eat food...");
    }
}

class Dog extends Animal{
    void bark()
    {
        System.out.println("i do barking....");
    }
}
class Cat extends Animal{
    void mew()
    {
        System.out.println("i do mewing....");
    }
}

public class inheritance{
    public static void main(String args[])
    {
        Dog d=new Dog();
        Cat c=new Cat();
        d.bark();
        d.eat();
        c.mew();
        c.eat();
    }
}


//note-java does not support multiple inheritance that is babydog extends dog,cat,animal...like that
