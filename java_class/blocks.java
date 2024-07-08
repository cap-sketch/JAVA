package java_class;
class LA{
    LA()
    {
        System.out.println("i am constructor");
    }
    static {
        System.out.println("i am static block");
    }
    {
        System.out.println("i am instance block");
    }
}

public class blocks {
    public static void main(String[] args) {
        LA n=new LA();

        
    }
}
