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

class babydog extends dog{
    void cry(){
        System.out.println("i cry");
    }
}

public class Multilevel_inheritance {
    public static void main(String[] args) {
        babydog b=new babydog();
        b.cry();
        b.bark();
        b.eat();        
    }
}
