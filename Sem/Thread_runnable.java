class Mythread11 implements Runnable{
    public void run()
    {
        int i=0;
        while(i<500)
        {
            System.out.println("thread 1 is running...");
             i++;
        }
    }
}
class Mythread22 implements Runnable{
    public void run()
    {
        int i=0;
        while(i<500)
        {
            System.out.println("thread 2");
             i++;
        }
    }
}
public class Thread_runnable {
    public static void main(String[] args) {
        Mythread11 bullet1=new Mythread11();
        Thread gun1=new Thread(bullet1);
        Mythread22 bullet2=new Mythread22();
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
