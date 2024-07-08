package java_class;
class Cylinder{
    private int radius;
    private int height;
    void setter(int r)
    {
        this.radius=r;
    }
    int getter()
    {
        return this.radius;
    }
    void setterh(int h)
    {
        this.height=h;
    }
    int getterh()
    {
        return this.height;
    }
    int surfacearea()
    {
        int area=(2*3*radius*height)+(2*3*radius*2);
        return area;
    }
}


public class getters_setter_cylinder {
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.setter(50);
        int r=c.getter();
        int h=c.getterh();
        System.out.println("the radius is: "+c.getter());
        System.out.println("the area is : "+c.surfacearea());
    }
}
