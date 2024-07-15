package Put_exam;

class Animal{
    void eat(){
        System.out.println("i eat food");
    }
}
class dog extends Animal{
    void bark()
    {
        System.out.println("i barking...");
    }
}

class cat extends Animal{
    void meow()
    {
        System.out.println("i meowing.....");
    }
}

public class herarchial_inheritance {
    public static void main(String[] args) {
        dog d=new dog();
        d.bark();
        d.eat();
        cat c=new cat();
        c.meow();
        c.eat();
     }
}
