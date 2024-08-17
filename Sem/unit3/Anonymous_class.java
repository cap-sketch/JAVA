package unit3;
//Anonymous class
/*type of class without a name that is created for one time use.
 * typically used to create a class that implements an interface or extends a class,
 *    but you don't need to reuse the class elsewhere in the code.
 */
public class Anonymous_class {
        public static void main(String[] args) {
            // Anonymous class for Mythread11
            Thread gun1 = new Thread(new Runnable() {
                public void run() {
                    int i = 0;
                    while (i < 500) {
                        System.out.println("thread 1 is running...");
                        i++;
                    }
                }
            });
    
            gun1.start();
        }
    
}
