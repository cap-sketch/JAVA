package Put_exam;

class Adder{
    static int adder(int a,int b)
    {
        return a+b;
    }
    static int adder(int a,int b,int c)
    {
        return a+b+c;
    }

}

public class Method_overloading extends Adder{

    public static void main(String args[])
    {
        System.out.println("sum of two numbers: "+Adder.adder(5, 6));
        System.out.println("sum of three numbers: "+Adder.adder(5, 6,7));

    }
}
