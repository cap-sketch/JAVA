package unit3;
//functional interface
/*-A functional interface is an interface that contains only one abstract method.
 *-they can have only one functionality to exhibit.
 *-functional interface in java are the new feature that provides users with the approach of fundamental programming.
 *-functional interface are interface that ensures they include precisely only one abstract method.
 */

//here runnable interface have only one abstract method(run())

public class functional_interface {
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

        // Anonymous class for Mythread22
        Thread gun2 = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (i < 500) {
                    System.out.println("thread 2");
                    i++;
                }
            }
        });

        gun1.start();
        gun2.start();
    }

}
