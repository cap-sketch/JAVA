package java_class;
class Runner implements Runnable{
    @Override
    public void run()
    {
        int i=0;
       // while(i<500)
        {
            System.out.println("i am thread 1");
            i++;
        }
        
    }
}
class Runner2 implements Runnable{
    @Override
    public void run()
    {
        int i=0;
        //while(i<500)
        {
            System.out.println("i am thread 2");
            i++;
        }
    }
}
public class Runnable_interface {
    public static void main(String[] args) {
        Runner bullet1=new Runner();
        Thread gun=new Thread(bullet1,"hey");
        Runner2 bullet2=new Runner2();
        Thread gun2=new Thread(bullet2,"hola");

        gun.start();
        gun2.start();
        System.out.println(gun.getName());
    }
}
