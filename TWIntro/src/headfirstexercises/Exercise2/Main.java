package headfirstexercises.Exercise2;

/**
 * Created with IntelliJ IDEA.
 * User: Maryum
 * Date: 7/7/14
 * Time: 1:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main{
    public static void main(String[] args) {
        Increment a = new Increment ();

        a.callSum = 0;

        a.increment();
        a.increment();
        a.increment();
        a.increment();
        a.increment();

        a.total();
    }
}
