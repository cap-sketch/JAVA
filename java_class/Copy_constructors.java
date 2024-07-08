package java_class;

class Employ{
    String name;
    Employ(){
        this.name="anmol";
    }
    Employ(Employ obj)
    {
        this.name=obj.name;
    }
}

public class Copy_constructors {
    public static void main(String[] args) {
        Employ e=new Employ();
        System.out.println(e.name);
        Employ e2=new Employ(e);
        System.out.println(e2.name);
    }
}
