package unit3;
//Annotations
/*Annoatations is a tag that repersents some metadata associated with the class,interface,method,or variables.
 *Annotations provide some extra information about the code which is used by the compiler and JVM.
 *types-maker,single value,full,type,repeating
 *type annotations-in java 8,type and repeating annotations were added to previous annotations.
 *earlier,annotations were used with declarations only,now it can be used by any type use.
 such as-@override
        -@SuppressWarning
        -@Deprecated
        -@functionalInterface
        -@Native
 examples-override code,functional interface code
 */

@FunctionalInterface
interface A{
    void run();
}
class aA implements A{
    public void run()
    {
        System.out.println("i am running..");
    }
}
public class Annotations {
    public static void main(String[] args) {
       aA a=new aA();
       a.run();
    }    
}
