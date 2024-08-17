package unit3;
//Anonymous objects
/*-means objects without reference
 *-we can't use such type of objects multiple times.
 *-they can be used only once.
 */
class A{
    void show()
    {
        System.out.println("hell boy");
    }
}
public class Anonymous_objects {
    public static void main(String[] args) {
        //one way
        A a=new A();
        a.show();

        //anonymous object
        new A().show();
    }
}
