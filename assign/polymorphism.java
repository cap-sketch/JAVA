package assign;
class Student{
    String name;
    public void func()
    {
        System.out.println("hey");
    }
    public void func(String name)
    {
        System.out.println("hey2");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="hello";
        s.func();
        s.func("haha");
    }
}
