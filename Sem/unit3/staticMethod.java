package unit3;
//static method
/*we can create any number of static methods in interfaces that can be directly accessed using interface name or subclass name.
 *can't override them.
 */
interface B{
    static void func()
    {
        System.out.println("hey boy");
    }
}
public class staticMethod {
    public static void main(String[] args) {
        B.func();
    }
}
