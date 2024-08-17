public class Methods {
    //method
    public int adder(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        Methods m=new Methods();
        int sum=m.adder(5,6);
        System.out.println(sum);
    }
}
