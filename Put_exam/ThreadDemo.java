package Put_exam;

class MyThread1 extends Thread {
    MyThread1(String name)
    {
        super(name);
    }
    int i = 0;
    public void run() {
      //  while (i < 500)
         {
            System.out.println("thread 1 is running...");
            i++;
        }
    }
}

class MyThread3 extends Thread {
    int i = 0;
    public void run() {
       // while (i < 500)
         {
            System.out.println("thread 2 is running");
            i++;
        }
    }
}

public class ThreadDemo { // Renamed from Thread to ThreadDemo
    public static void main(String[] args) {
        MyThread1 t1 =new MyThread1("hello");
        MyThread3 t2 =new MyThread3();
        t1.start();
        t2.start();
        System.out.println(t1.getName());
        System.out.println(t1.getId());
        System.out.println(t1.getPriority());
        t1.setPriority(5);
    }
}
