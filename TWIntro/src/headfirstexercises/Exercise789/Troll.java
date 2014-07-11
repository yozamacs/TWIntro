package headfirstexercises.Exercise789;

/**
 * Created with IntelliJ IDEA.
 * User: Maryum
 * Date: 7/11/14
 * Time: 12:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class Troll implements Monster {

    private int hitPoints;
    public Troll() {
        this.hitPoints = 40;
    }

    public void takeDamage(int amount) {
        hitPoints = hitPoints - amount/2;
    }

    public String name() {
        return "Troll";  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int currentHitpoints() {
        return hitPoints;
    }
}
