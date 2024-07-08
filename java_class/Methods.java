package java_class;

public class Methods {
    int sum(int a,int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        int a=4;
        int b=6;
        Methods obj=new Methods();
        int s=obj.sum(a,b);
        System.out.println(s);
    }
}
