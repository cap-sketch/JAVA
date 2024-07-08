package java_class;
class MyThr1 extends Thread{
    MyThr1(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=0;
        while(i<20)
        {
            System.out.println("i am thread 1");
             i++;
        }
    }
}

public class Thread_constructors {
    public static void main(String[] args) {
        MyThr1 t1=new MyThr1("anmol");
        t1.start();
        System.out.println("the id of thread is :" + t1.getId());
        System.out.println("the name of thread is "+t1.getName());
    }
}
