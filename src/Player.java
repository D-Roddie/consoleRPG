public class Player {

    private int health, maxHealth, dmg, spd;

    public Player() {
        maxHealth = 100;
        health = maxHealth;
        dmg = 25;
        spd = 5;

    }

    public int getDmg() {
        return dmg;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getHealth() {

        return health;
    }
    public int getSpd() {
        return spd;
    }
}
