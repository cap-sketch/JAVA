package unit3;
interface A{
    void sum(int a,int b);
}
class B{
    static void add(int x,int y)
    {
        int c=x+y;
        System.out.println("sum is: "+c);
    }
}
public class Method_reference {
    public static void main(String[] args) {
        A a=B::add;
        a.sum(10,20);
    }
}

//it treats the add function of class B as sum function of method.