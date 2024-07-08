/*create a class Game,which allows a user to play "guess the number"
  game once. 
  Game should have following methods: 
  1.constructor to generate the random number
  2.take user input() to take user input of number
  3.is corectNumber() to detect wheather the number entered is true
  4.getter and setter for no of guesses
  use properties such as no_of_guesses(int) ,etc to get it done.
 */
package java_class;

import java.util.Random;
import java.util.Scanner;

class Game{
    int random_number;
    int guess;
    int total_guess=0;
    Game(){
        Random random=new Random();
        random_number=random.nextInt(100);
    }
    int userinput()
    {
         Scanner sc=new Scanner(System.in);
         guess=sc.nextInt();
         return guess;
    }
    boolean isCorrect()
    {
        total_guess++;
        if(guess==random_number)
        {
            System.out.println("congratulations");
            return true;
        }
        else if(guess>random_number)
        {
            System.out.println("the number is smaller");
        }
        else if(guess<random_number)
        {
            System.out.println("the number is bigger");
        }
        return false;
    }
}

public class guess_the_number{
    public static void main(String[] args) {
        Game g=new Game();
        do{
            System.out.println("guess the number: ");
        g.userinput();
        g.isCorrect();
        }while(g.guess!=g.random_number);
        System.out.println("total number of guesses are: "+g.total_guess);
    }
}