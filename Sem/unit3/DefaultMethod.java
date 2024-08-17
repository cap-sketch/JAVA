package unit3;
//default method
/*Default method enables you to add new functionality to the interfaces of your libraries and ensure binary compatiblity with code written 
                                       for older version of those interfaces.
 *java provides a faciltiy to create default methods inside the interface.
 *methods which are defined,inside the interface and tagged with default are default keywords.
 *they are non abstract.
 */
interface A{
    default void run()
    {
        System.out.println("i am running...");
    }
}
class Aa implements A{
}
public class DefaultMethod {
    public static void main(String[] args) {
        Aa a=new Aa();
        a.run();
    }
}
