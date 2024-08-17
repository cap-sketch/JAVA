package unit3;
class outerr{
    class innerr{
        void func()
        {
            System.out.println("i am non static function..");
        }
    }
}

public class non_static_nestedClass {
    public static void main(String[] args) {
        outerr outobj=new outerr();
        outerr.innerr inobj=outobj.new innerr();
        inobj.func();
    }
}
