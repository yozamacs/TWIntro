package headfirstexercises.Exercise789;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Maryum
 * Date: 7/11/14
 * Time: 12:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class Orc implements Monster{

    private int hitPoints;
    public Orc() {
        this.hitPoints = 20;

    }

    public void takeDamage(int amount) {
       hitPoints = hitPoints - amount;
    }

    public String name() {
        return "Orc";
    }


    public int currentHitpoints() {
        return hitPoints;
    }

    public static void main(String[] args) {
         ArrayList<Monster> monsterList = new ArrayList<Monster>();
        Monster orcOne = new Orc();
        Monster trollOne = new Troll();

        monsterList.add(orcOne);
        monsterList.add(trollOne);

        for (Monster hitMonster: monsterList){
            hitMonster.takeDamage(10);
        }

        for (Monster viewDamage: monsterList){
            System.out.println(viewDamage.name()  + " has " + viewDamage.currentHitpoints() + " current hit points");
        }
    }
}
