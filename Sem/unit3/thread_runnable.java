package unit3;
//runnable interface
/*multithreading can be achieved by implementing runnable interface */
class MYthread implements Runnable{
    public void run()
    {
        int i=0;
        while(i<500)
        {
            System.out.println("thread 1 is running......");
            i++;
        }
    }
}

class MYthread2 implements Runnable{
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

public class thread_runnable {
    public static void main(String[] args) {
        MYthread t1=new MYthread();
        Thread gun=new Thread(t1);
        MYthread2 t2=new MYthread2();
        Thread gun2=new Thread(t2);
        gun.start();
        gun2.start();
    }
}
