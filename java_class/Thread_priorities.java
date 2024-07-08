package java_class;
class Thr1 extends Thread{
    Thr1(String name)
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
class Thr2 extends Thread{
    public void run()
    {
        System.out.println("i am Thread 2");
    }
}

public class Thread_priorities {
    public static void main(String[] args) {
        //ready queue :T1 T2 T3 T4 T5
        Thr1 t1=new Thr1("anmol1");
        Thr1 t2=new Thr1("anmol2");
        Thr1 t3=new Thr1("anmol3");
        Thr1 t4=new Thr1("anmol4 (most important)");
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
