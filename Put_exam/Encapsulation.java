package Put_exam;

class Student{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student a=new Student();
        a.setName("cheetah");
        System.out.println(a.getName());
        
    }
}
