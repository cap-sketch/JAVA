package java_class;
class Pen{       //blueprint of every pen with properties
    String color;                     //and functions.
    String type;              //data(int,string)
    //function of pen
    void write()              //members(functions)
    {
        System.out.println("writing something");
    }
    void printColor()
    {
        System.out.println(this.color);
    }
}

class Student{
    int age;
    String name;
    void printinfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //making non parameterised constructor
    Student()
    {
        System.out.println("constructor called");
    }

    //making a parameterised constructor
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    //making a copy constructor
    //if we want to create copy of objects we use copy constructor
    Student(Student s1)
    {
        this.name=s1.name;
        this.age=s1.age;
    }
}

public class ooPS {

    static void printer()
    {
        System.out.println("this is the age");
    }
    static void printer(int age)
    {
        System.out.println("this is the age "+ age);
    }
    static void printer(int age,String name)
    {
        System.out.println("this is the age "+age+" of "+name);
    }
    public static void main(String[] args) {
        // Pen pen1=new Pen(); //making object
        // pen1.color="blue";
        // pen1.type="gel";
        // pen1.write();

        // Pen pen2=new Pen();
        // pen2.color="black";
        // pen2.type="ballpoint";
        // pen2.printColor();
        // pen1.printColor();

       // Student s1=new Student("aman",25);
        //new keyword allocated memory in heap for object
        //constructor
          //student() is a constructor that is constructing object
          //used for constructing objects
          //have same name as class
          //does not return anything
          //constructor can be called only one time for one object
          //java makes a default constructor
          //we can also create constructor- non parameterised.
        // s1.age=15;                        //parameterised
        // s1.name="anmol";                  //copy constructors
        // s1.printinfo();
        

        printer();
        printer(15);
        printer(15,"anmol");
        
    }
}

//already have inbuilt distructors 
//have a garbage collector

//polymorphism----many forms
   //-> function overloading--compile time morphism
     //make many functions with same name but differnt parameters.
   //-> function overriding---runtime morphism

//inheritance--one class can take properties of one another
