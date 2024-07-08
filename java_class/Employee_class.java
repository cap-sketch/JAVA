package java_class;
class Employee{
    int salary;
    String name;
    int getsalary()
    {
         return salary;
    }
    String getname()
    {
        return name;
    }
    void setname(String n)
    {
        name=n;
    }

}
public class Employee_class{
    public static void main(String args[])
    {
        Employee e=new Employee();
        e.salary=100;
        e.name="Anmol";
        System.out.println(e.getsalary());
        System.out.println(e.getname());
        e.setname("harry");
        System.out.println(e.getname());
    }
}
