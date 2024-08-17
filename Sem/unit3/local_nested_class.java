package unit3;
class outercla{
    void func()
    {
        class innercla{
            void show()
            {
                System.out.println("i am inner class function...");
            }
        }
        innercla i=new innercla();
        i.show();
    }
}

public class local_nested_class {
    public static void main(String[] args) {
        
    }
}
