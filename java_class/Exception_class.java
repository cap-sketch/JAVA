package java_class;

import java.util.Scanner;

class MyException extends Exception{
    //we can write custom exception by overriding methods
    @Override
    public String toString()
    {
        return " i am tostring()";
    }
    @Override
    public String getMessage()
    { 
        return " i am getMessage()";
    }
}

public class Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<99)
        {
            try {
                throw new MyException();   
            } catch (Exception e) {
              System.out.println(e.getMessage());
              System.out.println(e);
            }
            
        }
        
    }
}
