package Put_exam;

public class StaticVariable {
    static int classVar1; // initialized to 0 by default
    static String classVar2 = "Hello"; // initialized explicitly
    
    public static void main(String[] args) {
        StaticVariable.classVar1 = 100;
        
        System.out.println(StaticVariable.classVar1); // prints 100
        System.out.println(StaticVariable.classVar2); // prints "Hello"
}
}