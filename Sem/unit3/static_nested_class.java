package unit3;
class outerclas{
    static class innerclas{
        void func()
        {
            System.out.println("i am innerclass function");
        }
    }
}

public class static_nested_class {
    public static void main(String[] args) {
        outerclas.innerclas obj=new outerclas.innerclas();
        obj.func();
    }
}
