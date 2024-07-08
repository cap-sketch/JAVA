package java_class;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class ball extends Pen{
    void write()
    {
        System.out.println("i do writing");
    }
    void refill()
    {
        System.out.println("i do refilling");
    }
    void changenib()
    {
        System.out.println("i change the nib");
    }
}
public class pen_pratice{
    public static void main(String[] args) {
        ball b=new ball();
        b.write();
        b.refill();
    }
}
