package java_class;
class thread1 extends Thread{
    thread1(String name){
        super(name);
    }
    public void run()
    {
        int i=0;
        while(i<500)
        {
        System.out.println("i am thread 1");
        i++;
        }
    }
}
class thread2 extends Thread{
    @Override
    public void run()
    {
        int i=0;
        while(i<500)
        {
        System.out.println("i am thread 2");
        i++;
        }
    }
}
public class Threading_extendingclass {
    public static void main(String[] args) {
        thread1 t1=new thread1("hello");
        thread2 t2=new thread2();
        System.out.println("Name of thread: "+t1.getName());
        t1.start();
        t2.start();
        System.out.println(t1.getId());
        System.out.println(t1.getPriority());
        t1.setPriority(10);
        t2.setPriority(15);
    }
}
