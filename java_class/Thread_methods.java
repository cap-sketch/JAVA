package java_class;

class Thr11 extends Thread{
    Thr11(String name)
    {
      super(name);
    }
    public void run()
    {
        int i=0;
        while(i<500)
        {
        System.out.println("i am Thread 1"+" "+this.getName());
        i++;    
    }
    }
}
class Thr22 extends Thread{
    Thr22(String name)
    {
      super(name);
    }
    @Override
    public void run()
    {
        while(true)
        {
        System.out.println("i am Thread 2"+" "+this.getName());
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
       
        }
    }
}

public class Thread_methods {
    public static void main(String[] args) {
        Thr11 t1=new Thr11("hello");
        Thr22 t2=new Thr22("boy");
        t1.start();
        //not start t2 till t1 get finished
        try{
            t1.join();
        }
        catch(Exception e){
           System.out.println(e);
        }
        t2.start();
    }
}
