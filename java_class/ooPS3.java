package java_class;
//strict abstraction using interface

interface Animall{
  void walk();    //also abstracted
  void voice();
    
}

//abstracting the animal class to not show it to user
abstract class Animal{       //we don't need to show it to user
   abstract void walk() ;    //user only care about horse or chicken
   void voice()
   {

   }
   Animal()
   {
    System.out.println("Animal constructor");
   }
}
//inheritance
class Horse extends Animal
{
    void walk()
    {
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal
{
    void walk()
    {
        System.out.println("walks on 2 legs");
    }
}


public class ooPS3{
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
        //cannot call for animal otherwise gives runtime error
        //because it is just a concept 
        //it is abstracted
    }
}


//abstraction
//show important data to user
//and restrict showing unimportant data