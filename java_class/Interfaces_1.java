package java_class;
interface bicycle{
    int b=50;   //allow properties that are final
    void works();
}
interface cycle{
    void alsoworks();
}
class Aero implements bicycle,cycle{
    public void works()
    {
        System.out.println("the bicycle works");
    }
    public void alsoworks()
    {
        System.err.println("the cycle also works");
    }
}

public class Interfaces_1 {
    public static void main(String[] args) {
        Aero a=new Aero();
        a.works();
        a.alsoworks();
        System.out.println(a.b);
    }
}
