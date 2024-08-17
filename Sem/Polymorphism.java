//polymorphism
/*-polymorphism means having many forms
  -real life example is a man being husband,son,father and employee in one person.
  -means having many forms for a method 
  types-compile time polymorphism
        method overloading is a process in which a class have many methods with the same name but different parameters.
        run time polymorphism
        method overiding is a process in which a sub class have a same method as parent class and it can have a new defination.
 */
package Sem;

//compile time polymorphism


// public class Polymorphism {
//      void adder(int a,int b)
//     {
//         System.out.println("the sum is :"+(a+b));
//     }
//      void adder(int a,int b,int c)
//     {
//         System.out.println("the sum is : "+(a+b+c));
//     }
//     public static void main(String[] args) {
//         Polymorphism p=new Polymorphism();
//         p.adder(1,2);
//         p.adder(1,2,3);
//     }   
// }


class vehicle{
    void run(){
        System.out.println("vehicle is running...");
    }
}
class bike extends vehicle{
    @Override
    void run(){
        System.out.println("bike is running...");
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        bike b=new bike();
        b.run();
    }
}