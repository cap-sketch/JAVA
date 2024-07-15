package Put_exam;

interface bicycle{
    static int a=5;
    final int b=6;
    abstract void run();
}

class Aeron implements bicycle{
    public void run()
    {
        System.out.println("i am running");
    }
}

public class Interface {
    public static void main(String[] args) {
        Aeron a=new Aeron();
        a.run();
   }
}
