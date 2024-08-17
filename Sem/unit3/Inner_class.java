package unit3;
//non static nested class(inner class)
/*it has access to all the members of outer class. */
class outerclasses{
    class Innerclass{
        void display(){
         System.out.println("inside inner class");
        }
    }
}

public class Inner_class {
    public static void main(String[] args) {
        //instantition
        outerclasses ob=new outerclasses();
        outerclasses.Innerclass obj=ob.new Innerclass();
        obj.display();
    }
}
