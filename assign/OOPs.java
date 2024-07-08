package assign;
class Pen{
    String color;
    String type;
    public void write()
    {
        System.out.println("writing something");
    }
    public void printColor()
    {
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
    public void printname()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

}

public class OOPs {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="red";
        pen1.type="gel";

        Pen pen2=new Pen();
        pen2.color="green";
        pen2.type="ball";

        pen1.printColor();
        pen2.printColor();

        Student s1=new Student();
        s1.name="anmol";
        s1.age=20;
        s1.printname();
         
    }
}
