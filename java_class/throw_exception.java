package java_class;

public class throw_exception {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        System.out.println("How are you doing?");
        
        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            else{
            int c = a / b;
            System.out.println(c);
            }
        } catch (ArithmeticException e) {
             System.out.println(e.getMessage());
        }
        
        System.out.println("Boy");
    }
}

