package java_class;

public class Try {
    public static void main(String[] args) {
        int a=6000;
        int b=0;
        System.out.println("how u doing");
        try {
            int  c=a/b;    
             System.out.println(c);
            } catch (Exception e) {
            System.out.println("cannot divide");
            System.out.println(e);
        }
        
        System.out.println("boy");
        
    }
}
