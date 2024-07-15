package Put_exam;

public class Instance{
    // Instance variables
    int instanceVar1=60; // initialized to 0 by default
    String instanceVar2 = "Hello"; // initialized explicitly
    
    public static void main(String[] args) {
        Instance obj1 = new Instance();
        Instance obj2 = new Instance();
        
        obj1.instanceVar1 = 10;
        obj2.instanceVar1 = 20;
        
        System.out.println(obj1.instanceVar1); // prints 10
        System.out.println(obj2.instanceVar1); // prints 20
    }
}
