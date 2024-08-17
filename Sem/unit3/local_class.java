package unit3;
//local class
/*-local class is nested class that is defined inside a block(method,constructor). */
class outercl{
    void outermethod()
    {
        class local{
            void display()
            {
                System.out.println("inside local class");
            }
        }
        local l=new local();
        l.display();
    }
}

public class local_class {
    public static void main(String[] args) {
        outercl cl=new outercl();
        cl.outermethod();
    }
}
