package Sem;

public class variable_arguments {
    static void foo(int...arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("the sum is: "+sum);
    }
    public static void main(String[] args) {
        foo(1);
        foo();
        foo(1,2,3,4,5);
    }
}
