package java_class;
class Monkeys{
    void jump()
    {
        System.out.println("i do jumping");
    }
    void bite()
    {
        System.out.println("i do biting");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}

class Humane extends Monkeys implements BasicAnimal{
    public void eat()
    {
        System.out.println("i only eat");
    }
    public void sleep()
    {
        System.out.println("i only sleep");
    }
    void speaks()
    {
        System.out.println("i can speak");
    }
}
public class monkey {
    public static void main(String[] args) {
        Humane h=new Humane();
        h.eat();
        h.sleep();
        h.jump();
        //polymorphism
        Monkeys m=new Humane();
        m.bite();    //object is humane but it can behave only as monkey
    }
}
