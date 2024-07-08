package java_class;
class good extends Thread{
    public void print()
    {
        int i=0;
        while(i<1000)
        {
            System.out.println("good morning");
            i++;
        }
    }
}
class welcome extends Thread{
    public void print()
    {
        int i=0;
        while(i<1000)
        {
            System.out.println("welcome");
            try {
                sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
             i++;
        }
}
}

public class Thread_good_welcome {
    public static void main(String[] args) {
        good g=new good();
        welcome w=new welcome();
        g.print();
        w.print();
        g.print();
    }
}
