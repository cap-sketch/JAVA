class Mythread1 extends Thread{
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
class Mythread2 extends Thread{
    @Override
    public void run()
    {
        int i=0;
        while(i<500)
        {
            System.out.println("thread 2");
            i++;
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }
        }
    }
}
public class Thread_class {
    public static void main(String[] args) {
        Mythread1 t1=new Mythread1();
        Mythread2 t2=new Mythread2();
        t1.start();
        t2.start();
        System.out.println(t1.getState());
        System.out.println(t1.getPriority());
        try{
        t1.setPriority(50);
        }
        catch(Exception e)
        {}
    }
}
