//encapsulation
/*encapsulation is a fundamental feature of object oriented programming.
  -encapuslation is a bundling of data and methods of that data into a single unit,called as class.
  -encapuslation is used for data hiding .
  -encapuslatio can be achieved by making the instance variable private and using the getters and setters to get and set the private variables.
  -the user can use the data but cannot view how it is been implemented in the class.
 */
package Sem;
class person{
    private int age;
    private String name;
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
}

public class encapsulation {
    public static void main(String args[])
    {
        person p=new person();
        p.setname("anmol");
        System.out.println("the name is: "+p.getname());
    }
}

//advantages
/*
 * data hiding
 * improved flexiblity for programmer
//disadvantages
-complex working
-less flexibliity for user
 */

 