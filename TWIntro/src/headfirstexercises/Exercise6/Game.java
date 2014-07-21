package headfirstexercises.Exercise6;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: Maryum
 * Date: 7/9/14
 * Time: 1:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    private int guess;
    private boolean status = true;
    private ArrayList<Integer> numList = new ArrayList<Integer>();

    Game(){
        guess = (int) (Math.random()* 100);
    }

    public boolean checkGuess(String userGuess){
        int userGuess1 = Integer.parseInt(userGuess);
        numList.add(userGuess1);
        if (userGuess1==guess){
            System.out.println("You guessed correctly!");
            System.out.println("Your guesses were " + numList);
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

    public void play(){
        while(status){
            UserGuess prompt = new UserGuess();
            String guess = prompt.getUserInput("Please enter a number");
            status = checkGuess(guess);
        }
    }
    public static void main(String[] args) {

        Game newGame = new Game();
        newGame.play();


    }

}
