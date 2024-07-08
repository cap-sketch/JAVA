package java_class;

class MyThread1 extends Thread{
    public void run()
    {
        int i=0;
        while(i<500)
        {
        System.out.println("My thread 1 is running");
        i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run()
    {
        int i=0;
        while(i<500)
        {
            System.out.println("My thread 2 is also running");
            i++;
        }
    
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
    }
    
}
