package java_class;
//this class is having a default access modifier
class Employee{
    int id;
    String name;

    void printer()
    {
        System.out.println("the id is : "+id);
        System.out.println("the name is: "+name);
    }

    //constructor
    Employee(){
        System.out.println("hey i am a constructor");
    }
}
//one java file can have only one public class
public class custom_class {
    public static void main(String args[])
    {
        Employee a=new Employee();

        //setting attributes/properties/data
        a.id=1;
        a.name="anmol";

        System.out.println("the id is:"+a.id);
        System.out.println("the name is: "+a.name);
        a.printer();
    }
    
}
