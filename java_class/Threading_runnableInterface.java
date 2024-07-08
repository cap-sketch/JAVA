package java_class;
class thread3 implements Runnable{
    public void run()
    {
       // while(true)
        System.out.println("i am running thread 3");
    }
}
class thread4 implements Runnable{
    public void run()
    {
        //   while(true)
        System.out.println("i am running thread 4");
    }
}

public class Threading_runnableInterface {
    public static void main(String args[])
    {
        thread3 bullet1=new thread3();
        Thread gun1=new Thread(bullet1,"hello");
        thread4 bullet2=new thread4();
        Thread gun2=new Thread(bullet2);
        System.out.println("name of thread is: "+gun1.getName());
        System.out.println(gun1.getState());
        gun1.start();
        System.out.println(gun1.getState());
        gun2.start();
        System.out.println(gun1.getState());        
    }
}
