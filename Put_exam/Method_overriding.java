package Put_exam;

class Vehicle{
    void run()
    {
        System.out.println("i am running...");
    }

}
class Audi extends Vehicle{
    @Override
    void run()
    {
        System.out.println("i am running fasttttt");
    }
}

public class Method_overriding {
    public static void main(String[] args) {
        Audi a=new Audi();
        a.run();
    }
}
