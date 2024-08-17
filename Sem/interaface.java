//interface is a mechanism that is used to achieve pure abstraction.
//it contains only public abstract methods with no defination that are overridden in classes implementing the interface.
//used to achieve multiple inheritance by implementing multiple interfaces.
//the variable are final and static in nature.
//implements keyword is used

interface bicycle{
   void brakes(int decrement);
   void speedup(int increment);
}
interface cycle{
    void run();
}
class Aeron implements cycle,bicycle{
    public void brakes(int decrement)
    {
        System.out.println("brakes applied");
    }
    public void speedup(int increment)
    {
        System.out.println("speed applied");
    }
    public void run()
    {
        System.out.println("the bike is running");
    }
}
public class interaface {
    public static void main(String[] args) {
        Aeron a=new Aeron();
        a.brakes(5);
        a.speedup(2);
        a.run();
    }
}
