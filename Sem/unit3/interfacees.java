package unit3;
//interface
/*interface is used to achieve complete abstraction in java.
 *interface can only have abstract methods with no defination and public by default..
 *interface can only have static and final variables.
 *interface are used to achieve multiple inheritance in java.
 */
interface bicycles{
    int aa=5;
    void brakes(int decrement);
    void speedup(int increment);
}
interface cycle{
    void run();
}
class AeronCycle implements cycle,bicycles{
    public void run()
    {
        System.out.println("cycle is running....");
    }
    public void brakes(int decrement)
    {
        System.out.println("brakes applied");
    }
    public void speedup(int increment)
    {
        System.out.println("speeding up");
    }
}

public class interfacees {
    public static void main(String args[])
    {
        AeronCycle a=new AeronCycle();
        a.run();
        a.brakes(5);
        a.speedup(10);
    }
}
