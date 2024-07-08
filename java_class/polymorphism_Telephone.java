package java_class;
abstract class Tele{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTele extends Tele{
    public void ring()
    {
        System.out.println("i am ringing.");
    }
    public void lift()
    {
        System.out.println("i am lifting");
    }
    public void disconnect()
    {
        System.out.println("i am disconnceting");
    }
}
public class polymorphism_Telephone {
    public static void main(String[] args) {
        //polymorphism
        Tele t=new SmartTele();
        t.ring();
    }
}
