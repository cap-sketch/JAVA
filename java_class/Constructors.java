package java_class;
class Myemployees{
    private int id;
    private String name;

    public String getname(){return name;}
    public void setname(String n){this.name=n;}
    public void setid(int i){this.id=i;}
    public int getid(){return id;}
    //constructor
    //same name as class
    //automatically invoked,no return type
    Myemployees(){
         id=45;
         name="sheer";
    }
    Myemployees(int i,String n){
         id=i;
         name=n;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Myemployees my=new Myemployees(23,"cheetah");
        Myemployees my2=new Myemployees();
       // my.setname("anmol");
       // my.setid(15);
        System.out.println(my.getname());
        System.out.println(my.getid());
        System.out.println(my2.getname());
        System.out.println(my2.getid());
    
    }
}
