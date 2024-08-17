package unit3;
//anonymous class
/*anonymous class is used to create a class without a name for one time use.
 *typically used for class that implement interface or extends class but used only one time.
 */
public class Anonymous_class2 {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable(){
            public void run()
            {
               int i=0;
               while(i<50)
               {
                System.out.println("thread 1 is running...");
                i++;
               }
            }
        });
        t.start();
        
    }
}
