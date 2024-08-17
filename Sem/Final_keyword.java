package Sem;
//final keyword
/*final keyword is a non access modifier used to indicate that a variable,method or class cannot be modified or extended.
  variable-cannot be changed value
  method-cannot be overridden by subclass
  class-cannot be extended by subclass
  provides security,robustness to code.
 */
final class A{
    final void func(){
        System.out.println("cannot be overridden by subclass");
    }
}

public class Final_keyword {
    public static void main(String args[])
    {
        final int a=5;
        System.out.println(a);
    
    }
    
}
