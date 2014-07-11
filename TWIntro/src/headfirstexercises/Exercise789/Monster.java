package headfirstexercises.Exercise789;

/**
 * Created with IntelliJ IDEA.
 * User: Maryum
 * Date: 7/11/14
 * Time: 12:10 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Monster {
    void takeDamage(int amount);
    String name();
    int currentHitpoints();
}
