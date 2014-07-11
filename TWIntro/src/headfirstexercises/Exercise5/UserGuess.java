package headfirstexercises.Exercise5;
import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: Maryum
 * Date: 7/9/14
 * Time: 12:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserGuess {
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine=is.readLine();
            if(inputLine.length()==0) return null;
        } catch (IOException e){
            System.out.print("IOException: " + e);
        }
        return inputLine;
    }
}
