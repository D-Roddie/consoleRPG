public class Player {

    private int health, maxHealth, dmg, spd;

    public Player(int startHealth,int startDmg, int startSpd) {
        maxHealth = startHealth;
        health = maxHealth;
        dmg = startDmg;
        spd = startSpd;

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
