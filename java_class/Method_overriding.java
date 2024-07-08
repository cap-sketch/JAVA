package java_class;
class HH{
    void show()
    {
        System.out.println("i am showing off");
    }
}
class TT extends HH{
    @Override  //annotation to check if it is actual overriding
    void show()
    {
        System.out.println("i am showing off again");
    }
}
public class Method_overriding {
    public static void main(String[] args) {
        HH h=new HH();
        h.show();
        TT t=new TT();
        t.show();
    }
}
