package unit3;
//nested class
/*we can create nested classes in java within the class or withing function also.
 *nested class may be static,private,protected or public.
 whereas,normal class can only be public or default.
 */

//static nested class
class outerclass{
    static class nestedclass{
        void display()
        {
            System.out.println("inside nested class");
        }
    }
}
public class nested_class {
    public static void main(String[] args) {
        outerclass.nestedclass obj=new outerclass.nestedclass();
        obj.display();
    }
}

//why use nested class
/*-logicall grouping classes that are used in one place
 *-increases encapsulation
 *-lead to more readable code.
 */

