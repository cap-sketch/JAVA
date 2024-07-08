package assign;

class Student{
    String name;
    int age;
    public void printe()
    {
        System.out.println(this.name+" "+this.age);
    }

    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}
public class constructors {

    public static void main(String[] args) {
       Student s1=new Student("anmol",20); //constructor
       s1.printe();
        
    }
}
