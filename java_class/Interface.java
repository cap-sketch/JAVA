package java_class;
interface bicycle{
    void applybrake(int decrement);
    void speedup(int increment);
}
interface cycle{

}

//multiple inheritance
class Aeron implements bicycle,cycle{
     public void applybrake(int decrement)
    {
       System.out.println("brakes applied");
    }
    public void speedup(int increment)
    {
        System.out.println("speed applied");
    }
}
public class Interface {
    public static void main(String[] args) {
       Aeron a=new Aeron();
       a.applybrake(5);
       a.speedup(6); 
    }
}
