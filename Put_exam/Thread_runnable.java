package Put_exam;

class mythread11 implements Runnable{
    public void run()
    {
        System.out.println("i am running");
    }
}

class mythread22 implements Runnable{
    public void run()
    {
        System.out.println("i am running again...");
    }
}


public class Thread_runnable {
    public static void main(String[] args) {
        mythread11 t1=new mythread11();
        Thread gun1=new Thread(t1);
        System.out.println(gun1.getState());
        gun1.start();

        mythread22 t2=new mythread22();
        Thread gun2=new Thread(t2);
        gun2.start();
        System.out.println(gun2.getState());
    }
}
