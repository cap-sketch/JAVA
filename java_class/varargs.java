package java_class;

public class varargs {
    // static int sum(int a,int b)
    // {
    //     return a+b;

    // }
    // static int sum(int a,int b,int c)
    // {
    //     return a+b+c;

    // }
    // static int sum(int a,int b,int c,int d)
    // {
    //     return a+b+c+d;

    // }
    //rather than creating so many functions 
    //we create a variable argument
    //that makes an array of all arguments
    static int sum(int...arr)
    {
        int result=0;
        for(int i=0;i<arr.length;i++)
        {
            result=result+arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("the sum is: "+sum());
        System.out.println("the sum is: "+sum(2,3));
        System.out.println("the sum is: "+sum(2,3,4));
        System.out.println("the sum is: "+sum(2,3,4,5));
        
    }
}
