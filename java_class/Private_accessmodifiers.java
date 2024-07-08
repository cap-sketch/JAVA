package java_class;
class Myemployee{
    private int id;
    private String name;

    //setter method
    public void setname(String n)
    {
        //we can add validations using setter method
        if(n=="anmol")
        {
            name="sheer";
        }
        else
        name=n;
    }
    //getter method
    public String getname()
    {
        return name;
    }

    //setter id method
    public void setid(int i)
    {
        id=i;
    }
    //getter id method
    public int getid()
    {
        return id;
    }
}
public class Private_accessmodifiers {
    public static void main(String[] args) {
        Myemployee my=new Myemployee();
        //my.id=14;           shows an error due to 
        //my.name="cheetah";      private access modifier
        my.setname("anmol");
        System.out.println(my.getname());
    }
}
