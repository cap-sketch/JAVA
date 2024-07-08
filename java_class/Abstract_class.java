package java_class;
abstract class Shape{
    int a=15;
    abstract void area();
    abstract void perimeter();
}
class triangle extends Shape{
    public void area()
    {
        System.out.println("the area is: "+a);
    }
   public void perimeter()
    {
            System.out.println("the perimeter is: ");
    }
}

public class Abstract_class {
    public static void main(String args[])
    {
        triangle t=new triangle();
        t.area();
    }
}
