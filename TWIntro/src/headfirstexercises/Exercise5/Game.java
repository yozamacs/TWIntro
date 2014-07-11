package headfirstexercises.Exercise5;

/**
 * Created with IntelliJ IDEA.
 * User: Maryum
 * Date: 7/9/14
 * Time: 12:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    private int guess;

    Game(){
          guess = (int) (Math.random()* 101);
    }

    public boolean checkGuess(String userGuess){
            int userGuess1 = Integer.parseInt(userGuess);
           if (userGuess1==guess){
               System.out.println("You guessed correctly!");
               return false;
           }
            else
           {
               if (userGuess1<guess){
               System.out.println("Guess higher!");
            }
                if (userGuess1>guess){
                System.out.println("Guess lower");
            }
               return true;
           }
    }
}
