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

public class single_inheritance {
    public static void main(String[] args) {
        dog d=new dog();
        d.bark();
        d.eat();
    }
}
