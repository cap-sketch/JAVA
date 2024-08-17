public class method_overloading{
    //method
    public int adder(int a,int b)
    {
        return a+b;
    }
    //method2
    public int adder(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        method_overloading m=new method_overloading();
        int sum=m.adder(5,6);
        int sum2=m.adder(5,6,7);
        System.out.println(sum+" "+sum2);
    }
} 
    
