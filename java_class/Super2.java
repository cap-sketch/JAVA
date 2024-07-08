package java_class;
class Aaa{
    int a=5;
    Aaa()
    {
          System.out.println("i am super constructor");
    }
    void show()
    {
        System.out.println("hello i am super show");
    }
}
class BB extends Aaa{
    int a=6;
    BB(){
         super(); //added automatically for super constructor calling
        System.out.println(a);
        System.out.println(super.a);
    }
    void show()
    {
        super.show();
        System.out.println("hello i am show");
    }
}

public class Super2 {
    public static void main(String[] args) {
        BB b=new BB();
        b.show();
        
    }
}
