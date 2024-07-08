package java_class;
class tree{
    void name()
    {
        System.out.println("i am tree");
    }
    void leaves()
    {
        System.out.println("i have leaves");
    }
}

class mango extends tree{
    void name()
    {
        System.out.println("i am mango tree");
    }
    void fruit()
    {
        System.out.println("i give fruits");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        tree t=new mango();
        t.name();
        t.leaves();
        
    }
    
}
