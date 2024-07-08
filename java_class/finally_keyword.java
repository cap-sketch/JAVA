package java_class;

public class finally_keyword {
    //finally block contains the code which is always 
       //executed wheather the exception is handled or not.
   public static int greet()
   {
   try {
    int a=5;
    int b=0;
    int c=a/b;
    return c;
     } catch (Exception e) {
    System.out.println(e);
     }
   finally{
    System.out.println("resouce cleanup....this is the end of program");
   }
   return 0;
  }
  
       public static void main(String[] args) {
         int k=greet();
         System.out.println(k);
}
}
