package headfirstexercises.Exercise5;

/**
 * Created with IntelliJ IDEA.
 * User: Maryum
 * Date: 7/8/14
 * Time: 11:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
            boolean status = true;

             UserGuess prompt = new UserGuess();
             Game newGame = new Game();

             while(status){
                 String guess = prompt.getUserInput("Please enter a number");
                 status = newGame.checkGuess(guess);
             }
    }
}
