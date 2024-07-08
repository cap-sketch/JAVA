package java_class;
interface inter1{
    void meth1();
    void meth2();
}
interface inter2 extends inter1{
    void meth3();
    void meth4();
}
class IN implements inter2{
     public void meth3()
     {
        System.out.println("hey");
     }
     public void meth4()
     {
        System.out.println("hii");
     }
     public void meth1()
     {
        System.out.println("hola");
     }
     public void meth2()
     {
        System.out.println("Bonjour");
     }
}
public class inheritance_interface {
    public static void main(String[] args) {
        IN i=new IN();
        i.meth1();
        i.meth3();
    }
}
