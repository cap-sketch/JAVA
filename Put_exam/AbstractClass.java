package Put_exam;
abstract class shape{
    shape()
    {
        System.out.println("i am abstract constructor");
    }
    int corners;
    abstract void area();
    abstract void perimeter();
    void func()
    {
        System.out.println("i am abstract class non abstract function");
    }
}

class Triangle extends shape{
    void area()
    {
        System.out.println("i am printing area");
    }
    void perimeter()
    {
        System.out.println("i am printing perimeter");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Triangle t=new Triangle();
        t.area();
        t.perimeter();
    }
}
