import java.util.ArrayList;
import java.util.List;

public class Player {

    private int health, maxHealth, dmg, spd;
    List<Item> inventory = new ArrayList<Item>();

    public Player(int startHealth,int startDmg, int startSpd, Weapon weapon, Armor armor) {
        maxHealth = startHealth;
        health = maxHealth;
        dmg = startDmg;
        spd = startSpd;

        inventory.add(weapon);
        inventory.add(armor);

    }

    //Getters Setters
    public int getDmg() {
        return dmg;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getHealth() { return health; }

    public int getSpd() {
        return spd;
    }

    public boolean isAlive(){
        if(health > 0){
            return true;
        }else return false;
    }

    public void decrementHealth(int decValue){
        health = health - decValue;
    }

    public void heal(){health = maxHealth;}
}
