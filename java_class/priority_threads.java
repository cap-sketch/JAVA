package java_class;
class Thr111 extends Thread{
    Thr111(String name)
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
class Thr222 extends Thread{
    Thr222(String name)
    {
      super(name);
    }
    @Override
    public void run()
    {
        int i=0;
        while(i<500)
        {
        System.out.println("i am Thread 2"+" "+this.getName());
        i++;    
    }
    }
}
public class priority_threads {
    public static void main(String[] args) {
        Thr111 t1=new Thr111("hey");
        Thr222 t2=new Thr222("boy");
       // t1.setPriority(6);
        // t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.err.println(t2.getPriority());
       
        t1.start();
        System.out.println(t1.getState());
        t2.start();
        
    }
}
