package Sem;
//static keyword
/*static keyword is mainly used for memory allocation.
  static keyword is used to associate a method with a class rather than the object.
  static keyword is a non acess modifier that can be used with-variable,method,blocks,classes.
  
 */
public class Static_keyword {
    static int a=5;
     public static void main(String[] args) {
        System.out.println("i am the main function");
        Static_keyword.func();
        System.out.println(Static_keyword.a);
    }
    static{
        System.out.println("hey i am static block");
    }    
    static void func()
    {
        System.out.println("i am static function");
    }

}

